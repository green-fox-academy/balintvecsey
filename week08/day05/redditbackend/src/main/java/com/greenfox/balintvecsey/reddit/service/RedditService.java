package com.greenfox.balintvecsey.reddit.service;

import com.greenfox.balintvecsey.reddit.models.Post;
import com.greenfox.balintvecsey.reddit.models.PostsList;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by Bálint on 2017. 05. 13..
 */
@Component
@Getter
@Setter
public class RedditService {

  @Autowired
  private PostRepository postRepository;
  @Autowired
  private PostsList postsList;
  @Autowired
  private Post post;

  public RedditService() {}

  public PostsList listAll() {
    postsList.setPosts(postRepository.findAll());
    return postsList;
  }

  public Post addPost(Post post) {
    postRepository.save(post);
    return post;
  }

  public Post upVote(Long id) {
    post = postRepository.findOne(id);
    post.setScore(post.getScore() + 1);
    postRepository.save(post);
    return post;
  }

  public Post downVote(Long id) {
    post = postRepository.findOne(id);
    post.setScore(post.getScore() - 1);
    postRepository.save(post);
    return post;
  }
}

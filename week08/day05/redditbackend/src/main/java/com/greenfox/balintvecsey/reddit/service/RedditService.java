package com.greenfox.balintvecsey.reddit.service;

import com.greenfox.balintvecsey.reddit.models.Post;
import com.greenfox.balintvecsey.reddit.models.User;
import java.util.HashMap;
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
  private UserRepository userRepository;

  @Autowired
  private PostRepository postRepository;

  @Autowired
  private Post post;

  @Autowired
  private User user;

  public RedditService() {}

  public HashMap<String, Iterable<Post>> listAll() {
    HashMap<String, Iterable<Post>> hashPosts = new HashMap<>();
    hashPosts.put("posts", postRepository.findAll());
    return hashPosts;
  }

  public Post addPost(String username, Post post) {
    user = userRepository.findByUsername(username);
    post.setOwner(user);
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

  public Post remove(String username, Long id) {
    user = userRepository.findByUsername(username);
    post = postRepository.findOne(id);
    if (post.getOwner().equals(user)) {
      postRepository.delete(post);
    }
    return post;
  }

  public Post edit(String username, Long id, Post postReq) {
    user = userRepository.findByUsername(username);
    post = postRepository.findOne(id);
    if (post.getOwner().equals(user)) {
      post.setTitle(postReq.getTitle());
      post.setHref(postReq.getHref());
      post.setTimestamp(postReq.getTimestamp());
      postRepository.save(post);
    }
    return post;
  }
}

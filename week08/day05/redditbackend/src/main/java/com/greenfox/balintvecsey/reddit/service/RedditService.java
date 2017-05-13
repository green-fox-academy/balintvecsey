package com.greenfox.balintvecsey.reddit.service;

import com.greenfox.balintvecsey.reddit.models.Post;
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

  public RedditService() {}

  public HashMap<String, Iterable<Post>> listAll() {
    HashMap<String, Iterable<Post>> hashPosts = new HashMap<>();
    hashPosts.put("posts", postRepository.findAll());
    return hashPosts;
  }

  public Post addPost(String username, Post post) {
    post.setOwner(username);
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

  public Post remove(Long id) {
    post = postRepository.findOne(id);
    postRepository.delete(post);
    return post;
  }

  public Post edit(Long id, Post postReq) {
    post = postRepository.findOne(id);
    post.setTitle(postReq.getTitle());
    post.setHref(postReq.getHref());
    post.setTimestamp(postReq.getTimestamp());
    postRepository.save(post);
    return post;
  }
}

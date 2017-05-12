package com.greenfox.balintvecsey.reddit.controllers;

import com.greenfox.balintvecsey.reddit.models.Post;
import com.greenfox.balintvecsey.reddit.models.PostList;
import com.greenfox.balintvecsey.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bálint on 2017. 05. 12..
 */
@RestController
public class MainRESTController {

  @Autowired
  PostRepository postRepository;

  @Autowired
  PostList postList;

  @Autowired
  Post post;

  @GetMapping("/posts")
  public PostList getPostList() {
    postList.setPosts(postRepository.findAll());
    return postList;
  }

  @PostMapping ("/posts")
  public Post addPost(@RequestBody Post post) {
    postRepository.save(post);
    return post;
  }

  @PutMapping ("/posts/{id}/upvote")
  public Post upVote(@PathVariable Long id) {
    post = postRepository.findOne(id);
    post.setScore(post.getScore() + 1);
    postRepository.save(post);
    return post;
  }

  @PutMapping ("/posts/{id}/downvote")
  public Post downVote(@PathVariable Long id) {
    post = postRepository.findOne(id);
    post.setScore(post.getScore() - 1);
    postRepository.save(post);
    return post;
  }
}

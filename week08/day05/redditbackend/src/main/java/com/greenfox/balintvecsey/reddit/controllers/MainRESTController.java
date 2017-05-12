package com.greenfox.balintvecsey.reddit.controllers;

import com.greenfox.balintvecsey.reddit.models.PostList;
import com.greenfox.balintvecsey.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

  @GetMapping("/posts")
  public PostList getPostList() {
    postList.setPosts(postRepository.findAll());
    return postList;
  }
}

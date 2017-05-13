package com.greenfox.balintvecsey.reddit.controllers;

import com.greenfox.balintvecsey.reddit.models.Post;
import com.greenfox.balintvecsey.reddit.models.PostsList;
import com.greenfox.balintvecsey.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin("*")
public class PostController {

  @Autowired
  RedditService redditService;

  @GetMapping("/posts")
  public PostsList getPostsList() {
    return redditService.listAll();
  }

  @PostMapping ("/posts")
  public Post addPost(@RequestBody Post post) {
    return redditService.addPost(post);
  }

  @PutMapping ("/posts/{id}/upvote")
  public Post upVote(@PathVariable Long id) {
    return redditService.upVote(id);
  }

  @PutMapping ("/posts/{id}/downvote")
  public Post downVote(@PathVariable Long id) {
    return redditService.downVote(id);
  }
}

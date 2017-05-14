package com.greenfox.balintvecsey.reddit.controllers;

import com.greenfox.balintvecsey.reddit.models.Post;
import com.greenfox.balintvecsey.reddit.service.RedditService;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bálint on 2017. 05. 12..
 */
@RestController
@CrossOrigin("*")
public class PostController {

  @Autowired
  private RedditService redditService;

  @GetMapping("/posts")
  public HashMap<String, Iterable<Post>> listAllPosts() {
    return redditService.listAll();
  }

  @PostMapping ("/posts")
  public Post addPost(@RequestHeader(value = "Username") String username, @RequestBody Post post) {
    return redditService.addPost(username, post);
  }

  @PutMapping ("/posts/{id}/upvote")
  public Post upVote(@PathVariable Long id) {
    return redditService.upVote(id);
  }

  @PutMapping ("/posts/{id}/downvote")
  public Post downVote(@PathVariable Long id) {
    return redditService.downVote(id);
  }

  @DeleteMapping("/posts/{id}")
  public Post removePost(@RequestHeader(value = "Username") String username, @PathVariable Long id) {
    return redditService.remove(username, id);
  }

  @PutMapping ("/posts/{id}")
  public Post editPost(@RequestHeader(value = "Username") String username, @PathVariable Long id, @RequestBody Post post) {
    return redditService.edit(username, id, post);
  }
}

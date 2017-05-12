package com.greenfox.balintvecsey.reddit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bálint on 2017. 05. 12..
 */
@Controller
public class MainController {

  @RequestMapping("/")
  public String index() {
    return "localhost:8080/";
  }
}

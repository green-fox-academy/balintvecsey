package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bálint on 2017. 05. 02..
 */

@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  public Greeting greeting() {
    return new Greeting(1, "Hello World!");
  }
}

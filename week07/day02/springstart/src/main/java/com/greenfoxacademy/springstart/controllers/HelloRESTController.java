package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bálint on 2017. 05. 02..
 */
@RestController
public class HelloRESTController {
  AtomicLong count = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam String name) {
    return new Greeting(count.incrementAndGet(), "Hello, " + name + "!");
  }
}

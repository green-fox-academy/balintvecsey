package com.greenfoxacademy.controllers;

import com.greenfoxacademy.models.GrootMessage;
import com.greenfoxacademy.models.MyError;
import com.greenfoxacademy.models.YonduArrow;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bálint on 2017. 05. 15..
 */
@RestController
public class GuardianController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public MyError errorParam(MissingServletRequestParameterException e) {
    if(e.getParameterName().equals("message")) {
      return new MyError("I am Groot!");
    } else {
      return new MyError("Please provide a " + e.getParameterName() + "!");
    }
  }

  @GetMapping("/groot")
  public GrootMessage translate(@RequestParam String message) {
    return new GrootMessage(message);
  }

  @GetMapping("/yondu")
  public YonduArrow speed(@RequestParam double distance, @RequestParam double time) {
    return new YonduArrow(distance, time);
  }
}

package com.greenfoxacademy.controllers;

import com.greenfoxacademy.models.GrootMessage;
import com.greenfoxacademy.models.MyError;
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
  public MyError errorParam() {
   return new MyError("I am Groot!");
  }

  @GetMapping("/groot")
  public GrootMessage translate(@RequestParam String message) {
    return new GrootMessage(message);
  }
}

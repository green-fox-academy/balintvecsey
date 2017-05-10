package com.greenfoxacademy.controllers;

import com.greenfoxacademy.models.Doubling;
import com.greenfoxacademy.models.MyError;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bálint on 2017. 05. 10..
 */
@RestController
public class MainRestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public MyError errorParam() {
    return new MyError("Please provide an input!");
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling doubling(@RequestParam(value = "input", required = true) int input) {
    return new Doubling(input);
  }
}

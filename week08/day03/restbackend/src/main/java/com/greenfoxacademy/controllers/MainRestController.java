package com.greenfoxacademy.controllers;

import com.greenfoxacademy.models.Doubling;
import com.greenfoxacademy.models.Greeter;
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
  public MyError errorParam(MissingServletRequestParameterException e) {
    if(e.getParameterName().equals("input")) {
      return new MyError("Please provide an " + e.getParameterName() + "!");
    } else {
      return new MyError("Please provide a " + e.getParameterName() + "!");
    }
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling doubling(@RequestParam(value = "input", required = true) int input) {
    return new Doubling(input);
  }

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Greeter doubling(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "title", required = true) String title) {
    return new Greeter("Oh, hi there " + name + ", my dear " + title + "!");
  }
}

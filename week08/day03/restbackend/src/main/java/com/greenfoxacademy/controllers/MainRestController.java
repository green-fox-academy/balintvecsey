package com.greenfoxacademy.controllers;

import com.greenfoxacademy.models.AppendA;
import com.greenfoxacademy.models.ArrayHandler;
import com.greenfoxacademy.models.DoUntil;
import com.greenfoxacademy.models.Doubling;
import com.greenfoxacademy.models.Greeter;
import com.greenfoxacademy.models.MyArray;
import com.greenfoxacademy.models.MyError;
import com.greenfoxacademy.models.Until;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public MyError errorHttpRequest() {
    return new MyError("Please provide a number!");
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling doubling(@RequestParam(value = "input", required = true) int input) {
    return new Doubling(input);
  }

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Greeter doubling(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "title", required = true) String title) {
    return new Greeter("Oh, hi there " + name + ", my dear " + title + "!");
  }

  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
  public AppendA appendA(@PathVariable String appendable) {
    return new AppendA(appendable);
  }

  @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
  public DoUntil doUntil(@PathVariable String what, @RequestBody Until until) {
    DoUntil doUntil = new DoUntil();
    int result = 0;
    if (what.equals("sum")) {
      for (int i = 1; i <= until.getUntil(); i++) {
        result += i;
      }
    } else if (what.equals("factor")) {
      result = 1;
      for (int i = 1; i <= until.getUntil(); i++) {
        result *= i;
      }
    }
    doUntil.setResult(result);
    return doUntil;
  }

  @RequestMapping(value = "/arrays", method = RequestMethod.POST)
  public ArrayHandler arrayHandler(@RequestBody MyArray myArray) {
    ArrayHandler arrayHandler = new ArrayHandler();
    int result = 0;
    if (myArray.getWhat().equals("sum")) {

    }
    return arrayHandler;
  }
}

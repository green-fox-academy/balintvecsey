package com.greenfoxacademy.controllers;

import com.greenfoxacademy.models.GrootMessage;
import com.greenfoxacademy.models.MyError;
import com.greenfoxacademy.models.RoraCargo;
import com.greenfoxacademy.models.YonduArrow;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
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

  @Autowired
  RoraCargo roraCargo;

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

  @GetMapping("/rocket")
  public RoraCargo info() {
    return roraCargo;
  }

  @GetMapping("/rocket/fill")
  public HashMap<String, Object> fill(@RequestParam String caliber, @RequestParam int amount) {
    HashMap<String, Object> fillInfo = new HashMap<>();
    roraCargo.fill(caliber, amount);

    fillInfo.put("received", caliber);
    fillInfo.put("amount", amount);
    fillInfo.put("shipstatus", roraCargo.getShipstatus());
    fillInfo.put("ready", roraCargo.isReady());
    return fillInfo;
  }

}

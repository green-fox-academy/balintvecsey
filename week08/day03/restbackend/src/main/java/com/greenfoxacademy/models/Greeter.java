package com.greenfoxacademy.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 05. 10..
 */
@Getter
@Setter
public class Greeter {
  private String welcome_message;

  public Greeter(String greet) {
    this.welcome_message = greet;
  }
}

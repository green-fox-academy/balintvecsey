package com.greenfoxacademy.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 05. 10..
 */
@Getter
@Setter
public class MyError {
  String error;

  public MyError(String description) {
    this.error = description;
  }
}

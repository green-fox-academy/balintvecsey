package com.greenfoxacademy.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 05. 10..
 */
@Getter
@Setter
public class AppendA {
  private String appended;

  public AppendA(String appendable) {
    this.appended = appendable + "a";
  }
}

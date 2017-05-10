package com.greenfoxacademy.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 05. 10..
 */
@Getter
@Setter
public class Doubling {
  private int received;
  private int result;

  public Doubling(int received) {
    this.received = received;
    result = received * 2;
  }
}

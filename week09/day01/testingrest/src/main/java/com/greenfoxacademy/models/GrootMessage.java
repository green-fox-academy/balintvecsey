package com.greenfoxacademy.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 05. 15..
 */
@Getter
@Setter
public class GrootMessage {
  private String received, translated;

  public GrootMessage(String message) {
    this.received = message;
    translated = "I am Groot!";
  }
}

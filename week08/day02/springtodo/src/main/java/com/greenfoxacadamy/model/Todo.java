package com.greenfoxacadamy.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 05. 09..
 */
@Getter
@Setter
public class Todo {
  private int id;
  private String title;
  private boolean isUrgent, isDone;

  public Todo() {
    isUrgent = false;
    isDone = false;
  }
}

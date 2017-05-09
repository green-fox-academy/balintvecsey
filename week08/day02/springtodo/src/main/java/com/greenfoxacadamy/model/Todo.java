package com.greenfoxacadamy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 05. 09..
 */
@Getter
@Setter
@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;
  private String title;
  private boolean isUrgent, isDone = false;

  public Todo() {}

  public Todo(String title) {
    this.title = title;
  }
}

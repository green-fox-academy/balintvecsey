package com.greenfoxacademy.thymeleafstart.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 05. 03..
 */
@Getter
@Setter
@AllArgsConstructor
public class BankAccount2 {
  String name, balance, animalType;
  boolean isKing,isGood;

  public boolean getIsKing() {
    return isKing;
  }

  public boolean getIsGood() {
    return isGood;
  }
}

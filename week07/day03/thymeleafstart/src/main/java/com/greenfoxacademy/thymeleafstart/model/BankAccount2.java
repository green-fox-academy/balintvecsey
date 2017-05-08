package com.greenfoxacademy.thymeleafstart.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 05. 03..
 */
@Component
@Getter
@Setter
public class BankAccount2 {
  String name;
  int balance;
  String animalType;
  boolean isKing,isGood;

  public BankAccount2(String name, int balance, String animalType, boolean isKing, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood = isGood;
  }

  public boolean getIsKing() {
    return isKing;
  }

  public boolean getIsGood() {
    return isGood;
  }

  public void increaseBalance(int increase) {
    balance += increase;
  }
}

package com.greenfoxacadamy.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 05. 04..
 */
@Getter
@Component
public class Fox {
  String name, food, drink;
  List<String> tricks;

  public Fox() {
    this.name = "Mr. Fox";
    this.food = "bread";
    this.drink = "water";
    tricks = new ArrayList<>();
  }
}

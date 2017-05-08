package com.greenfoxacademy.springstart.model;

import java.util.Random;

/**
 * Created by Bálint on 2017. 05. 05..
 */
public class Hello {
  String text;
  String color;
  String size;

  public Hello(String text) {
    this.text = text;
    color = getColorCode();
    size = getFontSize();
  }

  public String getText() {
    return text;
  }

  public String getColor() {
    return color;
  }

  public String getSize() {
    return size;
  }

  public String getColorCode() {
    Random random = new Random();
    int nextInt = random.nextInt(256*256*256);
    String colorCode = String.format("#%06x", nextInt);
    return colorCode;
  }

  public String getFontSize() {
    Random random = new Random();
    int size = random.nextInt(68);
    return size + "px";
  }
}

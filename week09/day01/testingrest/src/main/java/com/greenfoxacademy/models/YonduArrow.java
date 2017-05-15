package com.greenfoxacademy.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 05. 15..
 */
@Getter
@Setter
public class YonduArrow {
  private double distance, time, speed;

  public YonduArrow(double distance, double time) {
    this.distance = distance;
    this.time = time;
    speed = distance / time;
  }
}

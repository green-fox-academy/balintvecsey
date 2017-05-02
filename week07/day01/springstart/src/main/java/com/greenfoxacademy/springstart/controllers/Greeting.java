package com.greenfoxacademy.springstart.controllers;


import java.util.concurrent.atomic.AtomicLong;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 05. 02..
 */
@Getter
@Setter
@AllArgsConstructor
public class Greeting {
  long id;
  String content;
}

package com.greenfoxacademy.thymeleafstart.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 05. 08..
 */
@Component
@Getter
@Setter
public class Hit {
  String hit, accountIndex;

  public int getHitInt() {
    return Integer.parseInt(hit);
  }

  public int getAccountIndexInt() {
    return Integer.parseInt(accountIndex);
  }
}

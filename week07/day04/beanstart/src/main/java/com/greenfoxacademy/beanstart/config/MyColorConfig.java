package com.greenfoxacademy.beanstart.config;

import com.greenfoxacademy.beanstart.model.BlueColor;
import com.greenfoxacademy.beanstart.model.GreenColor;
import com.greenfoxacademy.beanstart.model.MyColor;
import com.greenfoxacademy.beanstart.model.RedColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Bálint on 2017. 05. 04..
 */
@Configuration
public class MyColorConfig {

  @Bean
  public RedColor redColor() {
    return new RedColor();
  }

  @Bean
  public GreenColor greenColor() {
    return new GreenColor();
  }

  @Bean
  public BlueColor blueColor() {
    return new BlueColor();
  }
}

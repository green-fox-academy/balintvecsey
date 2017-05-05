package com.greenfoxacadamy.controllers;

import com.greenfoxacadamy.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Bálint on 2017. 05. 04..
 */
@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping("/")
  public ModelAndView index() {
    ModelAndView m = new ModelAndView();
    m.setViewName("index");
    m.addObject("fox", fox);

    return m;
  }
}

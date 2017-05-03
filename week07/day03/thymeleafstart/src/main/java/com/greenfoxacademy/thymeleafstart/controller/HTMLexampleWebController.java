package com.greenfoxacademy.thymeleafstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bálint on 2017. 05. 03..
 */
@Controller
public class HTMLexampleWebController {

  @RequestMapping("/Exercise4")
  public String exercise4(Model model) {
    model.addAttribute("text", "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
    model.addAttribute("utext", "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
    return "HTMLexample";
  }
}

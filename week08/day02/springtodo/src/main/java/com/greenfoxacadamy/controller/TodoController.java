package com.greenfoxacadamy.controller;

import com.greenfoxacadamy.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Bálint on 2017. 05. 09..
 */
@Controller
@ResponseBody
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  private TodoRepository repository;

  @RequestMapping("/list")
  public String list(Model model) {
    return "This is my first todo";
  }
}

package com.greenfoxacademy.controller;

import com.greenfoxacadamy.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bálint on 2017. 05. 09..
 */
@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository repository;

  @Autowired
  public TodoController(TodoRepository repository) {
    this.repository = repository;
  }

  @RequestMapping(value = "/list")
  public String list(Model model) {
    model.addAttribute("todos", repository.findAll());
    return "todo";
  }
}

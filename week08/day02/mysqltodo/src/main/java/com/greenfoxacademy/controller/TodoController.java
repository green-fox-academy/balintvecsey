package com.greenfoxacademy.controller;

import com.greenfoxacademy.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

  @RequestMapping(value = {"/list", "/"})
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos", repository.findAllByIsDone(false));
    } else {
      model.addAttribute("todos", repository.findAll());
    }
    return "todo";
  }
}

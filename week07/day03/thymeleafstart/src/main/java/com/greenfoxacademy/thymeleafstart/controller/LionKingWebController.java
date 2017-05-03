package com.greenfoxacademy.thymeleafstart.controller;

import com.greenfoxacademy.thymeleafstart.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bálint on 2017. 05. 03..
 */
@Controller
public class LionKingWebController {

  @RequestMapping("/Exercise1")
  public String exercise1(Model model){
    BankAccount simba = new BankAccount("Simba", "2000", "lion");
    model.addAttribute("name", simba.getName());
    model.addAttribute("balance", simba.getBalance());
    model.addAttribute("animalType", simba.getAnimalType());
    return "BankAccount";
  }
}

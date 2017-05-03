package com.greenfoxacademy.thymeleafstart.controller;

import com.greenfoxacademy.thymeleafstart.model.BankAccount;

import com.greenfoxacademy.thymeleafstart.model.BankAccount2;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bálint on 2017. 05. 03..
 */
@Controller
public class LionKingWebController {

  @RequestMapping("/Exercise1")
  public String exercise1(Model model) {
    BankAccount simba = new BankAccount("Simba", "2000", "lion");
    model.addAttribute("name", simba.getName());
    model.addAttribute("balance", simba.getBalance());
    model.addAttribute("animalType", simba.getAnimalType());
    return "BankAccount";
  }

  @RequestMapping("/Exercise5")
  public String exercise5(Model model) {
    List<BankAccount2> bank = new ArrayList<>();
    bank.add(new BankAccount2("Simba", "2000", "lion", true, true));
    bank.add(new BankAccount2("Nala", "500", "lion", false, true));
    bank.add(new BankAccount2("Zordon", "3000", "lion", true, false));
    bank.add(new BankAccount2("Timon", "1", "meerkat", false, true));
    bank.add(new BankAccount2("Pumba", "2", "warthog", false, true));
    model.addAttribute("bank", bank);
    return "BankAccountList";
  }
}

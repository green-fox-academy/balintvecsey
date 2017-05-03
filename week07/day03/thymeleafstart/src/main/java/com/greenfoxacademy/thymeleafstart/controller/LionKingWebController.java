package com.greenfoxacademy.thymeleafstart.controller;

import com.greenfoxacademy.thymeleafstart.model.BankAccount;
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
    List<BankAccount> bank = new ArrayList<>();
    bank.add(new BankAccount("Simba", "2000", "lion"));
    bank.add(new BankAccount("Nala", "500", "lion"));
    bank.add(new BankAccount("Zordon", "3000", "lion"));
    bank.add(new BankAccount("Timon", "0", "meerkat"));
    bank.add(new BankAccount("Pumba", "0", "warthog"));
    model.addAttribute("bank", bank);
    return "BankAccountList";
  }
}

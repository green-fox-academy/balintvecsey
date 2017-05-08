package com.greenfoxacademy.thymeleafstart.controller;

import com.greenfoxacademy.thymeleafstart.model.BankAccount;

import com.greenfoxacademy.thymeleafstart.model.BankAccount2;
import com.greenfoxacademy.thymeleafstart.model.Hit;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bálint on 2017. 05. 03..
 */
@Controller
public class LionKingWebController {
  List<BankAccount2> bank = new ArrayList<>();
  @Autowired
  Hit increase;

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
    bank.add(new BankAccount2("Simba", 2000, "Lion", true, true));
    bank.add(new BankAccount2("Nala", 500, "Lion", false, true));
    bank.add(new BankAccount2("Zordon", 3000, "Lion", true, false));
    bank.add(new BankAccount2("Timon", 1, "Meerkat", false, true));
    bank.add(new BankAccount2("Pumba", 2, "Warthog", false, true));
    model.addAttribute("bank", bank);
    model.addAttribute("hitObject", increase);
    return "BankAccountList2";
  }

  @RequestMapping("/hit")
  public String hit(Hit hit) {
    int index = hit.getAccountIndexInt();
    int increase = hit.getHitInt();
    bank.get(index).increaseBalance(increase);
    return "redirect:/Exercise5";
  }
}

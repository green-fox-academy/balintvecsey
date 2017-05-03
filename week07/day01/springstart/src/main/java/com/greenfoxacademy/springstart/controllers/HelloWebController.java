package com.greenfoxacademy.springstart.controllers;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Bálint on 2017. 05. 02..
 */
@Controller
public class HelloWebController {
  AtomicLong counter = new AtomicLong();
  Random random = new Random();
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam String name, Model model) {
    model.addAttribute("hello", hellos);
    model.addAttribute("name", name);
    model.addAttribute("counter", counter.incrementAndGet());
    model.addAttribute("color", getColorCode());
    model.addAttribute("size", getFontSize());
    return "greeting";
  }

  public String getColorCode() {
    int nextInt = random.nextInt(256*256*256);
    String colorCode = String.format("#%06x", nextInt);
    return colorCode;
  }

  public String getHello() {
    int nextInt = random.nextInt(hellos.length);
    String hello = hellos[nextInt];
    return hello;
  }

  public String getFontSize() {
    int size = random.nextInt(48);
    return size + "px";
  }
}

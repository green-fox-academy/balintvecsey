package com.greenfoxacademy.thymeleafstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ThymeleafstartApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafstartApplication.class, args);
	}
}

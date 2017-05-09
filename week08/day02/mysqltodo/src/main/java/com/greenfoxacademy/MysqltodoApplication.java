package com.greenfoxacademy;

import com.greenfoxacademy.model.Todo;
import com.greenfoxacademy.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqltodoApplication{

	public static void main(String[] args) {
		SpringApplication.run(MysqltodoApplication.class, args);
	}
}

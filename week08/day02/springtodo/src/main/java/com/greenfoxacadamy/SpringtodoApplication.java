package com.greenfoxacadamy;

import com.greenfoxacadamy.model.Todo;
import com.greenfoxacadamy.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringtodoApplication  implements CommandLineRunner{

	@Autowired
	TodoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringtodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Todo("I have to learn Object Relational Mapping"));
	}
}

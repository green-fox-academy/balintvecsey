package com.greenfoxacademy;

import com.greenfoxacademy.model.Todo;
import com.greenfoxacademy.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2todoApplication implements CommandLineRunner{

	@Autowired
	TodoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(H2todoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Todo("I have to learn Object Relational Mapping"));
	}
}

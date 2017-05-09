package com.greenfoxacademy.repository;

import com.greenfoxacadamy.model.Todo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bálint on 2017. 05. 09..
 */
public interface TodoRepository extends CrudRepository<Todo, Long> {

}

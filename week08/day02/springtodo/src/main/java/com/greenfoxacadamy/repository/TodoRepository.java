package com.greenfoxacadamy.repository;

import com.greenfoxacadamy.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 05. 09..
 */
public interface TodoRepository extends CrudRepository<Todo, Long> {

}

package com.greenfox.balintvecsey.reddit.service;

import com.greenfox.balintvecsey.reddit.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 05. 13..
 */
@Component
public interface UserRepository extends CrudRepository<User, Long> {

}

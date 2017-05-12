package com.greenfox.balintvecsey.reddit.repository;

import com.greenfox.balintvecsey.reddit.models.Post;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 05. 12..
 */
@Component
public interface PostRepository extends CrudRepository<Post, Long>{
  List<Post> findAll();
}

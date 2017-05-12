package com.greenfox.balintvecsey.reddit.models;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 05. 12..
 */
@Component
@Getter
@Setter
public class PostsList {
  List<Post> posts;
}

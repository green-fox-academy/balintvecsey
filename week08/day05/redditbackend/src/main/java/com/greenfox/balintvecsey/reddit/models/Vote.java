package com.greenfox.balintvecsey.reddit.models;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 05. 13..
 */
@Getter
@Setter
public class Vote {
  private long userId;
  private long postId;
  int vote;
}

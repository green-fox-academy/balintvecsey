package com.greenfox.balintvecsey.reddit.models;


import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 05. 12..
 */
@Getter
@Setter
public class Post {
  private long id;
  private String title, href;
  private Timestamp timestamp;
  private long score;

  public Post(long id, String title, String href, Timestamp timestamp, long score) {
    this.id = id;
    this.title = title;
    this.href = href;
    timestamp = new Timestamp(System.currentTimeMillis() / 1000);
    this.score = score;
  }
}

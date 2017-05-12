package com.greenfox.balintvecsey.reddit.models;


import java.sql.Timestamp;
import javafx.geometry.Pos;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bálint on 2017. 05. 12..
 */
@Getter
@Setter
@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String href;
  private Timestamp timestamp;
  private long score;

  public Post() {}

  public Post(String title, String href, Timestamp timestamp, long score) {
    this.title = title;
    this.href = href;
    this.timestamp = timestamp;
    this.score = score;
  }
}

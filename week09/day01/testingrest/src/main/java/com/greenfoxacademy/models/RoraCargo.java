package com.greenfoxacademy.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Bálint on 2017. 05. 15..
 */
@Component
@Getter
@Setter
public class RoraCargo {
  private static final int MAXSIZE = 12500;
  private int caliber25, caliber30, caliber50;
  private String shipstatus;
  private boolean ready;

  public RoraCargo() {
    shipstatus = "empty";
    ready = false;
  }

  public boolean isReady() {
    return ready;
  }

  public void fill(String caliber, int amount) {
    switch (caliber) {
      case ".25":
        caliber25 += amount;
        break;
      case ".30":
        caliber30 += amount;
        break;
      case ".50":
        caliber50 += amount;
        break;
    }

    int actualCargo = getCaliber25() + getCaliber30() + getCaliber50();;
    int cargoStat = (actualCargo * 100)/MAXSIZE;
    if(actualCargo == MAXSIZE) {
      setReady(true);
      setShipstatus("full");
    } else if(actualCargo > MAXSIZE) {
      setShipstatus("overloaded");
    } else {
      setShipstatus(cargoStat + "%");
    }
  }
}

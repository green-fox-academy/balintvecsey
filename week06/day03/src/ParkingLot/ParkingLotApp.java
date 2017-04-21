package ParkingLot;

import java.util.Collections;

/**
 * Created by Bálint on 2017. 04. 19..
 */
public class ParkingLotApp {

  public static void main(String[] args) {
    ParkingLot p1 = new ParkingLot(256);

    p1.countAndPrintType(p1.getParkinglot());
    p1.countAndPrintColor(p1.getParkinglot());
    p1.mostCommonVehicle(p1.getParkinglot());
  }
}

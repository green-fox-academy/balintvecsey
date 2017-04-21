package ParkingLot;

/**
 * Created by Bálint on 2017. 04. 19..
 */
public class ParkingLotApp {

  public static void main(String[] args) {
    ParkingLot p1 = new ParkingLot(256);

    p1.typeCountAndPrint(p1.getParkinglot());
    p1.colorCountAndPrint(p1.getParkinglot());
    p1.vehicleMostCommon(p1.getParkinglot());
  }
}

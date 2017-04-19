package ParkingLot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bálint on 2017. 04. 19..
 */
public class ParkingLot {

  public static void main(String[] args) {
    List<Car> parkinglot = new ArrayList<>();

    for (int i = 0; i < 256; i++) {
      parkinglot.add(i, new Car(randomColor(), randomType()));
    }

    for (Car car : parkinglot) {
      System.out.println(car.toString());
    }
  }

  public static ColorsOfCar randomColor(){
    int d8 = (int) (Math.random() * 8) + 1;
    if(d8 == 1){
      return ColorsOfCar.RED;
    } else if (d8 == 2){
      return ColorsOfCar.BLUE;
    } else if (d8 == 3){
      return ColorsOfCar.GREEN;
    } else if (d8 == 4){
      return ColorsOfCar.YELOW;
    } else if (d8 == 5){
      return ColorsOfCar.GRAY;
    } else if (d8 == 6){
      return ColorsOfCar.BLACK;
    } else if (d8 == 7){
      return ColorsOfCar.WHITE;
    } else {
      return ColorsOfCar.ORANGE;
    }
  }

  public static TypeOfCar randomType(){
    int d8 = (int) (Math.random() * 8) + 1;
    if(d8 == 1){
      return TypeOfCar.TOYOTA;
    } else if (d8 == 2){
      return TypeOfCar.HONDA;
    } else if (d8 == 3){
      return TypeOfCar.OPEL;
    } else if (d8 == 4){
      return TypeOfCar.CITROEN;
    } else if (d8 == 5){
      return TypeOfCar.RENAULT;
    } else if (d8 == 6){
      return TypeOfCar.FIAT;
    } else if (d8 == 7){
      return TypeOfCar.VOLKSWAGEN;
    } else {
      return TypeOfCar.SKODA;
    }
  }
}

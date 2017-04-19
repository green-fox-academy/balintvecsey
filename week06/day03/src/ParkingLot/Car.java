package ParkingLot;

/**
 * Created by Bálint on 2017. 04. 19..
 */
public class Car {
  TypeOfCar type;
  ColorsOfCar color;

  public Car(ColorsOfCar color, TypeOfCar type){
    this.color = color;
    this.type = type;
  }

  @Override
  public String toString(){
    return color + " "+ type;
  }
}

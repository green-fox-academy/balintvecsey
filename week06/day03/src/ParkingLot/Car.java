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

  public TypeOfCar getType(){
    return type;
  }

  public ColorsOfCar getColor(){
    return color;
  }

  @Override
  public String toString(){
    return color + " "+ type;
  }
}

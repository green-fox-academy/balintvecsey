package ParkingLot;

/**
 * Created by Bálint on 2017. 04. 19..
 */
public class Car {
  TypeOfCar type;
  ColorOfCar color;

  public Car(ColorOfCar color, TypeOfCar type){
    this.color = color;
    this.type = type;
  }

  public TypeOfCar getType(){
    return type;
  }

  public ColorOfCar getColor(){
    return color;
  }

  @Override
  public String toString(){
    return color + " "+ type;
  }
}

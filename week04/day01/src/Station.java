/**
 * Created by Bálint on 2017. 04. 03..
 */
public class Station {
  int gasAmount;

  public Station(){
    gasAmount = 5000;
  }

  public void refill(Car car){
    car.gasAmount += car.capacity;
    gasAmount -= car.capacity;
  }

  public static void main(String[] args) {
    Car car = new Car();
    Station station = new Station();

    station.refill(car);
    System.out.println(car.gasAmount);
  }
}

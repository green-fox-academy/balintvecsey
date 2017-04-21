package ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Bálint on 2017. 04. 19..
 */
public class ParkingLot {

  List<Car> parkinglot = new ArrayList<>();

  public ParkingLot(int size) {
    for (int i = 0; i < size; i++) {
      parkinglot.add(i, new Car(ColorOfCar.getRandomColor(), TypeOfCar.getRandomType()));
    }
  }

  public List<Car> getParkinglot() {
    return parkinglot;
  }

  public void typeCountAndPrint(List<Car> parkinglot) {
    HashMap<TypeOfCar, Integer> typeCount = new HashMap<>();

    for (Car car : parkinglot) {
      Integer val = typeCount.get(car.getType());
      typeCount.put(car.getType(), val == null ? 1 : val + 1);
    }
    System.out.println(typeCount);
  }

  public void colorCountAndPrint(List<Car> parkinglot) {
    HashMap<ColorOfCar, Integer> colorCount = new HashMap<>();

    for (Car car : parkinglot) {
      Integer val = colorCount.get(car.getColor());
      colorCount.put(car.getColor(), val == null ? 1 : val + 1);
    }
    System.out.println(colorCount);
  }

  public void vehicleMostCommon(List<Car> parkinglot) {
    HashMap<Car, Integer> common = new HashMap<>();

    for (Car car : parkinglot) {
      Integer val = common.get(car);
      common.put(car, val == null ? 1 : val + 1);
    }

    HashMap.Entry<Car, Integer> max = null;

    for (HashMap.Entry<Car, Integer> e : common.entrySet()) {
      if (max == null || e.getValue() > max.getValue()) {
        max = e;
      }
    }
    System.out.println(max.getKey());
  }
}

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
      parkinglot.add(i, new Car(randomColor(), randomType()));
    }
  }

  public List<Car> getParkinglot() {
    return parkinglot;
  }

  public void countAndPrintType(List<Car> parkinglot) {
    HashMap<TypeOfCar, Integer> typeCount = new HashMap<>();

    for (Car car : parkinglot) {
      TypeOfCar type = car.getType();
      if (typeCount.containsKey(type)) {
        typeCount.replace(type, typeCount.get(type) + 1);
      } else {
        typeCount.put(type, 1);
      }
    }
    System.out.println(typeCount);
  }

  public void countAndPrintColor(List<Car> parkinglot) {
    HashMap<ColorOfCar, Integer> colorCount = new HashMap<>();

    for (Car car : parkinglot) {
      ColorOfCar color = car.getColor();
      if (colorCount.containsKey(color)) {
        colorCount.replace(color, colorCount.get(color) + 1);
      } else {
        colorCount.put(color, 1);
      }
    }
    System.out.println(colorCount);
  }

  public void mostCommonVehicle(List<Car> parkinglot) {
    HashMap<Car, Integer> common = new HashMap<>();

    for (Car car : parkinglot) {
      Integer val = common.get(car);
      common.put(car, val == null ? 1 : val + 1);
    }

    HashMap.Entry<Car, Integer> max = null;

    for (HashMap.Entry<Car, Integer> e : common.entrySet()) {
      if (max == null || e.getValue() > max.getValue())
        max = e;
    }
    System.out.println(max.getKey());
  }

  public ColorOfCar randomColor() {
    int d8 = (int) (Math.random() * 8) + 1;
    if (d8 == 1) {
      return ColorOfCar.RED;
    } else if (d8 == 2) {
      return ColorOfCar.BLUE;
    } else if (d8 == 3) {
      return ColorOfCar.GREEN;
    } else if (d8 == 4) {
      return ColorOfCar.YELOW;
    } else if (d8 == 5) {
      return ColorOfCar.GRAY;
    } else if (d8 == 6) {
      return ColorOfCar.BLACK;
    } else if (d8 == 7) {
      return ColorOfCar.WHITE;
    } else {
      return ColorOfCar.ORANGE;
    }
  }

  public TypeOfCar randomType() {
    int d8 = (int) (Math.random() * 8) + 1;
    if (d8 == 1) {
      return TypeOfCar.TOYOTA;
    } else if (d8 == 2) {
      return TypeOfCar.HONDA;
    } else if (d8 == 3) {
      return TypeOfCar.OPEL;
    } else if (d8 == 4) {
      return TypeOfCar.CITROEN;
    } else if (d8 == 5) {
      return TypeOfCar.RENAULT;
    } else if (d8 == 6) {
      return TypeOfCar.FIAT;
    } else if (d8 == 7) {
      return TypeOfCar.VOLKSWAGEN;
    } else {
      return TypeOfCar.SKODA;
    }
  }
}

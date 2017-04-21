package ParkingLot;

public enum TypeOfCar {
  TOYOTA, HONDA, OPEL, CITROEN, RENAULT, FIAT, VOLKSWAGEN, SKODA;

  public static TypeOfCar getRandomType() {
    return values()[(int) (Math.random() * values().length)];
  }
}

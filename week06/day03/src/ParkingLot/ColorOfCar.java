package ParkingLot;

public enum ColorOfCar {
  RED, BLUE, GREEN, YELLOW, GRAY, BLACK, WHITE, ORANGE;

  public static ColorOfCar getRandomColor() {
    return values()[(int) (Math.random() * values().length)];
  }
}

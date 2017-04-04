package TheGarden;

/**
 * Created by Bálint on 2017. 04. 04..
 */
public class Flower {
  String className;
  String color;
  int waterAmount;

  public Flower(String color){
    this.color = color;
    className = "Flower";
    waterAmount = 0;
  }

  public void checkWater(){
    if (waterAmount < 5) {
      System.out.println("The " + color + " " + className + " needs water.");
    } else {
      System.out.println("The " + color + " " + className + " doesn't needs water.");
    }
  }

  public void watering(int waterUnit){
    System.out.println("Watering with " + waterUnit);
    waterUnit *= 0.75f;
    waterAmount += waterUnit;
  }

  public static void main(String[] args) {
    Flower flower = new Flower("yellow");
    flower.checkWater();
    flower.watering(40);
    flower.checkWater();
  }
}

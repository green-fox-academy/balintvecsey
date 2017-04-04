package TheGarden;

/**
 * Created by Bálint on 2017. 04. 04..
 */
public class Flower extends Plants{


  public Flower(String color){
    super.color = color;
    className = "Flower";
    waterAmount = 0;
  }

  public boolean checkWater(){
    boolean isThirsty = false;
    if (waterAmount < 5) {
      System.out.println("The " + color + " " + className + " needs water.");
      isThirsty = true;
    } else {
      System.out.println("The " + color + " " + className + " doesn't needs water.");
    }
    return isThirsty;
  }

  public void watering(int waterUnit){
    waterUnit *= 0.75f;
    waterAmount += waterUnit;
  }
}

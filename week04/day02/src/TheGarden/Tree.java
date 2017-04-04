package TheGarden;

/**
 * Created by Bálint on 2017. 04. 04..
 */
public class Tree extends Plants {

  public Tree(String color){
    super.color = color;
    className = "Tree";
    waterAmount = 0;
  }

  public boolean checkWater(){
    boolean isThirsty = false;
    if (waterAmount < 10) {
      System.out.println("The " + color + " " + className + " needs water.");
      isThirsty = true;
    } else {
      System.out.println("The " + color + " " + className + " doesn't needs water.");
    }
    return isThirsty;
  }

  public void watering(int waterUnit){
    waterUnit *= 0.4f;
    waterAmount += waterUnit;
  }

}

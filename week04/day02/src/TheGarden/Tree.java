package TheGarden;

/**
 * Created by Bálint on 2017. 04. 04..
 */
public class Tree {
  String className;
  String color;
  int waterAmount;

  public Tree(String color){
    this.color = color;
    className = "Tree";
    waterAmount = 0;
  }

  public void checkWater(){
    if (waterAmount < 10) {
      System.out.println("The " + color + " " + className + " needs water.");
    } else {
      System.out.println("The " + color + " " + className + " doesn't needs water.");
    }
  }

  public void watering(int waterUnit){
    System.out.println("Watering with " + waterUnit);
    waterUnit *= 0.4f;
    waterAmount += waterUnit;
  }

  public static void main(String[] args) {
    Tree tree = new Tree("yellow");
    tree.checkWater();
    tree.watering(20);
    tree.checkWater();
  }
}

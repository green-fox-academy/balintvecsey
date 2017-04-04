package TheGarden;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bálint on 2017. 04. 04..
 */
public class Garden {
  List<Plants> plants;

  Flower flower1 = new Flower("yellow");
  Flower flower2 = new Flower("blue");
  Tree tree1 = new Tree("purple");
  Tree tree2 = new Tree("orange");

  public Garden (){
    plants = new ArrayList<>();
    plants.add(flower1);
    plants.add(flower2);
    plants.add(tree1);
    plants.add(tree2);
  }

  public void infoGarden(){
    for (Plants plant: plants) {
      plant.checkWater();
    }
  }

  public void addWater(int waterUnit){
    System.out.println("Watering with " + waterUnit);
    for (Plants plant : plants) {
      plant.watering(waterUnit / plants.size());
    }
  }
}

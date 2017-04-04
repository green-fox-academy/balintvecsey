package TheGarden;

/**
 * Created by Bálint on 2017. 04. 04..
 */
public class GardenApp {

  public static void main(String[] args) {
    Garden garden = new Garden();

    garden.infoGarden();
    garden.addWater(40);
    garden.infoGarden();
    garden.addWater(70);
    garden.infoGarden();
  }
}
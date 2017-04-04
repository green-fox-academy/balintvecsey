package TheGarden;

import java.util.List;

/**
 * Created by Bálint on 2017. 04. 04..
 */
public class Garden {
  List<Flower> flowers;
  List<Tree> trees;

  public Garden (){
  }

  public void addFlower(Flower flower){
    flowers.add(flower);
  }

  public void addTree(Tree tree){
    flowers.add(tree);
  }

  public void watering(){
  }
}

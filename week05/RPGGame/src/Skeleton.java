/**
 * Created by Bálint on 2017. 04. 10..
 */
public class Skeleton extends Monster {

  public Skeleton() {
    super.setImage("assets/skeleton.png");
    super.posX = (int) (Math.random() * 9);
    super.posY = (int) (Math.random() * 9);
  }
}

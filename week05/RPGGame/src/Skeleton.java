/**
 * Created by Bálint on 2017. 04. 10..
 */
public class Skeleton extends Monster {

  public Skeleton() {
    super.image = ImageLoader.getInstance().SKELETON;
    super.posX = (int) (Math.random() * 10);
    super.posY = (int) (Math.random() * 10);
  }
}

/**
 * Created by Bálint on 2017. 04. 10..
 */
public class Boss extends Monster {

  public Boss() {
    super.image = ImageLoader.getInstance().BOSS;
    super.posX = (int) (Math.random() * 10);
    super.posY = (int) (Math.random() * 10);
  }
}

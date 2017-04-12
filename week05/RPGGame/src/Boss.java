/**
 * Created by Bálint on 2017. 04. 10..
 */
public class Boss extends Monster {

  public Boss() {
    super.setImage("assets/boss.png");
    super.posX = (int) (Math.random() * 9);
    super.posY = (int) (Math.random() * 9);
  }
}

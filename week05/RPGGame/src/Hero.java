import java.awt.image.BufferedImage;

/**
 * Created by Bálint on 2017. 04. 10..
 */
public class Hero extends GameObjects {

  public Hero() {}
  public Hero(BufferedImage image, int posX, int posY) {
    super(image, posX, posY);
  }

  public void moveUp() {
    this.posY --;
    image = ImageLoader.getInstance().HERO_UP;
  }

  public void moveDown() {
    this.posY ++;
    image = ImageLoader.getInstance().HERO_DOWN;
  }

  public void moveLeft() {
    this.posY --;
    image = ImageLoader.getInstance().HERO_LEFT;
  }

  public void moveRight() {
    this.posY ++;
    image = ImageLoader.getInstance().HERO_RIGHT;
  }
}

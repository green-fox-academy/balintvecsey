import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 * Created by Bálint on 2017. 04. 10..
 */
public class Monster extends GameObjects {

  public Monster() {}

  public Monster(BufferedImage image, int posX, int posY) {
    super(image, posX, posY);
  }

  public void draw(Graphics graphics, Area area) {
    if (!area.isWall(posX, posY)) {
      graphics.drawImage(image, posX * TILE_WIDTH, posY * TILE_HEIGHT, null);
    } else {
      posX = (int) (Math.random() * 10);
      posY = (int) (Math.random() * 10);
      draw(graphics, area);
    }
  }
}

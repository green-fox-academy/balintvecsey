import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Created by Bálint on 2017. 04. 10..
 */
public class GameObjects {

  public static final int TILE_WIDTH = 72;
  public static final int TILE_HEIGHT = 72;

  BufferedImage image;
  int posX, posY;

  public GameObjects() {}

  public GameObjects (BufferedImage image, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    this.image = image;
  }

  public void setImage(String filename) {
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX * TILE_WIDTH, posY * TILE_HEIGHT, null);
    }
  }
}

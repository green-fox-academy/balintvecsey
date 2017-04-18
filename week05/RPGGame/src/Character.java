import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 * Created by Bálint on 2017. 04. 13..
 */
public class Character extends GameObjects {

  public Character() {}

  public Character(BufferedImage image, int posX, int posY) {
    super(image, posX, posY);
  }

  public boolean isOccupied(Character character, int x, int y) {
    if (x == character.posX && y == character.posY) {
      return true;
    }
    return false;
  }
}

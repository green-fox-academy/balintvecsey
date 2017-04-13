import static com.sun.glass.ui.Cursor.setVisible;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 * Created by Bálint on 2017. 04. 10..
 */
public class Board extends JComponent implements KeyListener {

  public static final int MAPSIZE = 720;
  int heroX, heroY;
  BufferedImage facing;
  Area area;
  Hero hero;
  Monster boss, skeleton1, skeleton2, skeleton3;

  public Board() {
    heroX = heroY = 0;
    facing = ImageLoader.getInstance().HERO_DOWN;
    area = new Area();
    boss = new Boss();
    skeleton1 = new Skeleton();
    skeleton2 = new Skeleton();
    skeleton3 = new Skeleton();

    setPreferredSize(new Dimension(MAPSIZE, MAPSIZE));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    area.draw(graphics);

    skeleton1.draw(graphics);
    skeleton2.draw(graphics);
    skeleton3.draw(graphics);

    boss.draw(graphics);

    Hero hero = new Hero(facing, heroX, heroY);
    hero.draw(graphics);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP && heroY != 0 && !area.isWall(heroX, heroY - 1)) {
      facing = ImageLoader.getInstance().HERO_UP;
      heroY--;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && heroY < MAPSIZE - 72 && !area
        .isWall(heroX, heroY + 1)) {
      facing = ImageLoader.getInstance().HERO_DOWN;
      heroY++;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && heroX != 0 && !area.isWall(heroX - 1, heroY)) {
      facing = ImageLoader.getInstance().HERO_LEFT;
      heroX--;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && heroX < MAPSIZE - 72 && !area.isWall(heroX + 1, heroY)) {
      facing = ImageLoader.getInstance().HERO_RIGHT;
      heroX++;
    }

    invalidate();
    repaint();
  }
}

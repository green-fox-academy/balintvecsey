import static com.sun.glass.ui.Cursor.setVisible;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;

/**
 * Created by Bálint on 2017. 04. 10..
 */
public class Board extends JComponent implements KeyListener {

  int heroX, heroY;
  String facing;

  public Board() {
    heroX = heroY = 0;
    facing = "assets/hero-down.png";

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    Area area = new Area();
    area.draw(graphics);

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
    if (e.getKeyCode() == KeyEvent.VK_UP && heroY != 0) {
      facing = "assets/hero-up.png";
      heroY --;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && heroY < 642) {
      facing = "assets/hero-down.png";
      heroY ++;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && heroX != 0) {
      facing = "assets/hero-left.png";
      heroX --;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && heroX < 642) {
      facing = "assets/hero-right.png";
      heroX ++;
    }

    invalidate();
    repaint();
  }
}

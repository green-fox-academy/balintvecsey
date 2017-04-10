import static com.sun.glass.ui.Cursor.setVisible;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * Created by Bálint on 2017. 04. 10..
 */
public class Area extends JComponent implements KeyListener {

  int heroX;
  int heroY;
  String facing;

  public Area() {
    heroX = 0;
    heroY = 0;
    facing = "assets/hero-down.png";

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    int unit = 72;

    Path path = Paths.get("assets/board.txt");
    try {
      List<String> lines = Files.readAllLines(path);

      for (int i = 0; i < lines.size(); i++) {
        for (int j = 0; j < lines.size(); j++) {
          if (lines.get(j).charAt(i) == '0') {
            Floor image = new Floor(i * unit, j * unit);
            image.draw(graphics);
          } else {
            Wall image = new Wall(i * unit, j * unit);
            image.draw(graphics);
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    Hero hero = new Hero(facing, heroX, heroY);
    hero.draw(graphics);
  }

  //To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }
  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP && heroY != 0) {
      facing = "assets/hero-up.png";
      heroY -= 72;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && heroY < 642) {
      facing = "assets/hero-down.png";
      heroY += 72;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && heroX != 0) {
      facing = "assets/hero-left.png";
      heroX -= 72;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && heroX < 642) {
      facing = "assets/hero-right.png";
      heroX += 72;
    }
    // and redraw to have a new picture with the new coordinates
    invalidate();
    repaint();
  }
}

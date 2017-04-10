import static com.sun.glass.ui.Cursor.setVisible;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * Created by Bálint on 2017. 04. 10..
 */
public class Area extends JComponent implements KeyListener{

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
    //graphics.fillRect(testBoxX, testBoxY, 100, 100);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        Floor image = new Floor(i * unit, j * unit);
        image.draw(graphics);
      }
    }

    //Vertical walls
    for (int i = 6; i < 8; i++) {
      Wall image = new Wall(unit, i * 72);
      image.draw(graphics);
    }

    for (int i = 0; i < 3; i++) {
      Wall image = new Wall(unit * 3, i * 72);
      image.draw(graphics);
    }

    for (int i = 4; i < 7; i++) {
      Wall image = new Wall(unit * 3, i * 72);
      image.draw(graphics);
    }

    for (int i = 8; i < 10; i++) {
      Wall image = new Wall(unit * 3, i * 72);
      image.draw(graphics);
    }

    for (int i = 0; i < 5; i++) {
      Wall image = new Wall(unit * 5, i * 72);
      image.draw(graphics);
    }

    for (int i = 6; i < 9; i++) {
      Wall image = new Wall(unit * 5, i * 72);
      image.draw(graphics);
    }

    for (int i = 1; i < 3; i++) {
      Wall image = new Wall(unit * 7, i * 72);
      image.draw(graphics);
    }

    for (int i = 1; i < 3; i++) {
      Wall image = new Wall(unit * 8, i * 72);
      image.draw(graphics);
    }

    //Horizontal walls
    for (int i = 1; i < 3; i++) {
      Wall image = new Wall(i * 72, unit * 2);
      image.draw(graphics);
    }

    for (int i = 0; i < 3; i++) {
      Tile image = new Wall(i * 72, unit * 4);
      image.draw(graphics);
    }

    for (int i = 7; i < 10; i++) {
      Tile image = new Wall(i * 72, unit * 4);
      image.draw(graphics);
    }

    for (int i = 6; i < 10; i++) {
      Tile image = new Wall(i * 72, unit * 6);
      image.draw(graphics);
    }

    for (int i = 1; i < 3; i++) {
      Tile image = new Wall(i * 72, unit * 8);
      image.draw(graphics);
    }

    for (int i = 6; i < 9; i++) {
      Tile image = new Wall(i * 72, unit * 8);
      image.draw(graphics);
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

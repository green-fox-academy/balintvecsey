/**
 * Created by Bálint on 2017. 03. 28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    graphics.setColor(Color.cyan);
    graphics.fillRect(20, 20, 100, 30);

    graphics.setColor(Color.magenta);
    graphics.fillRect(20, 60, 50, 30);

    graphics.setColor(Color.yellow);
    graphics.fillRect(20, 100, 30, 30);

    graphics.setColor(Color.black);
    graphics.fillRect(20, 140, 90, 30);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Created by Bálint on 2017. 03. 30..
 */
public class Fractal {


  public static void Fractal(Graphics graphics){

    int min = 0;
    int max = 300;
    graphics.setColor(Color.yellow);
    graphics.fillRect(min, min, max, max);
    graphics.setColor(Color.black);
    fractRect(graphics);
  }

  public static void fractRect(Graphics g) {

    int min = 0;
    int max = 300;
    g.drawLine(min, min, max, min);
    g.drawLine(min, min, min, max);
    g.drawLine(max, min, max, max);
    g.drawLine(min, max, max, max);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 345));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      Fractal(graphics);

    }
  }

}

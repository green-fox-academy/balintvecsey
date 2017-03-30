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

  public static void mainDraw(Graphics graphics){
    int min = 0;
    int max = 600;
    graphics.setColor(Color.yellow);
    graphics.fillRect(min, min, max, max);
    fracto(min, min, max, graphics);
  }

  public static void rect(int x, int y, int max, Graphics g) {
    g.setColor(Color.black);
    g.drawLine(x + max / 3, y, x + max / 3, y + max);
    g.drawLine(x + max / 3 * 2, y, x + max / 3 *2, y + max);
    g.drawLine(x, y + max / 3, x + max, y + max / 3);
    g.drawLine(x, y + max / 3 * 2, x + max, y + max / 3 *2);
  }

  public static void  fracto(int x, int y, int max, Graphics g) {
    if (max > 0) {
      rect(x, y, max, g);
      fracto(x + max / 3, y, max / 3, g);
      fracto(x + max / 3 * 2, y + max /3, max /3 , g);
      fracto(x, y + max / 3, max / 3, g);
      fracto(x + max /3, y + max / 3 * 2, max / 3, g);
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(620, 645));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}

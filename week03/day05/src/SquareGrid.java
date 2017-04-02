import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Created by Bálint on 2017. 03. 31..
 */
public class SquareGrid {

  public static void mainDraw(Graphics graphics) {
    int a = 600;
    recur(a/4, a/4, a/2, a/2, graphics);
  }

  public static void grid(int x, int y, int w, int h, Graphics g) {
    g.drawRect(x, y, w, h);
    //g.fillRect(x - w / 2, y - h / 2, w, h);
  }

  public static void recur(int x, int y, int w, int h, Graphics g) {
    if (w > 10) {
      grid(x, y, w, h, g);

      recur(x - w / 4, y - h / 4, w / 2, h / 2, g);
      //recur(x - w / 4, y - h / 4, w / 2, h / 2, g);
      /*recur(x, y - h,w / 2, h / 2, g);
      recur(x, y + h,w / 2, h / 2, g);
      recur(x - w, y ,w / 2, h / 2, g);
      recur(x + w, y ,w / 2, h / 2, g);


      recur(x + w, y + h,w / 2, h / 2, g);
      recur(x - w, y - h,w / 2, h / 2, g);
      recur(x - w, y + h,w / 2, h / 2, g);
      recur(x + w, y - h,w / 2, h / 2, g);*/
    }
  }

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
      setBackground(Color.white);
      mainDraw(graphics);

    }
  }
}

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Created by Bálint on 2017. 03. 31..
 */
public class Carpet {

  public static void mainDraw(Graphics graphics) {
    recur(300, 300, 200, 200, graphics);
  }

  public static void carpet(int x, int y, int w, int h, Graphics g) {
    g.setColor(Color.black);
    g.fillRect(x - w / 2, y - h / 2, w, h);
  }

  public static void recur(int x, int y, int w, int h, Graphics g) {
    if (w > 1) {
      carpet(x, y, w, h, g);

      recur(x, y - h,w / 3, h / 3, g);
      recur(x, y + h,w / 3, h / 3, g);
      recur(x - w, y ,w / 3, h / 3, g);
      recur(x + w, y ,w / 3, h / 3, g);


      recur(x + w, y + h,w / 3, h / 3, g);
      recur(x - w, y - h,w / 3, h / 3, g);
      recur(x - w, y + h,w / 3, h / 3, g);
      recur(x + w, y - h,w / 3, h / 3, g);
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

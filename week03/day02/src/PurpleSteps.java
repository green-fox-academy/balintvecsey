/**
 * Created by Bálint on 2017. 03. 28..
 */
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps/r3.png]
    for (int i = 10; i < 200 ; i+=10) {
      graphics.setColor(Color.black);
      graphics.drawRect(i, i, 10, 10);
      graphics.setColor(new Color(153, 51, 153));
      graphics.fillRect(i, i, 10, 10);
    }

    /*graphics.drawRect(corner, corner, size, size);
    graphics.setColor(new Color(153, 51, 153));
    graphics.fillRect(corner, corner, size, size);*/


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

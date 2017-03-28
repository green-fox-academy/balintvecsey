/**
 * Created by Bálint on 2017. 03. 28..
 */

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.
    int size = 38;

    for (int i = 0; i < 8; i ++) {
      for (int j = 0; j < 8; j++) {
        if ((i + j) % 2 == 0){
          graphics.setColor(Color.white);
          graphics.fillRect(i * 38, j * 38, size, size);
        } else {
          graphics.setColor(Color.black);
          graphics.fillRect(i * 38, j * 38, size, size);
        }
      }
    }
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
      mainDraw(graphics);

    }
  }
}
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * Created by Bálint on 2017. 04. 10..
 */
public class MainLoop{

  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Area area = new Area();
    frame.add(area);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods

    frame.addKeyListener(area);

    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }
}
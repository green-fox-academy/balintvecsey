import java.awt.Color;
import javafx.geometry.Pos;

/**
 * Created by Bálint on 2017. 04. 03..
 */
public class PostIt {
  Color backgroundColor;
  String text;
  Color textColor;

  public PostIt(Color backgroundColor, String text, Color textColor){}

  public static void main(String[] args) {
    PostIt postIt1 = new PostIt(Color.orange, "Idea 1", Color.blue);
    PostIt postIt2 = new PostIt(Color.pink, "Awesome", Color.black);
    PostIt postIt3 = new PostIt(Color.yellow, "Superb!", Color.green);
  }
}

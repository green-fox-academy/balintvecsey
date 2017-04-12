import java.awt.Graphics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Bálint on 2017. 04. 12..
 */
public class Area extends GameObjects{

  public Area() {}

  public void draw(Graphics g) {
    Path path = Paths.get("assets/board.txt");
    try {
      List<String> lines = Files.readAllLines(path);

      for (int i = 0; i < lines.size(); i++) {
        for (int j = 0; j < lines.size(); j++) {
          if (lines.get(j).charAt(i) == '0') {
            Floor image = new Floor(i, j);
            image.draw(g);
          } else {
            Wall image = new Wall(i, j);
            image.draw(g);
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

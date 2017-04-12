import java.awt.Graphics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Bálint on 2017. 04. 12..
 */
public class Area extends GameObjects {

  boolean isWall = false;

  public Area() {}

  public List<String> level() {
    Path path = Paths.get("assets/board.txt");
    try {
      List<String> lines = Files.readAllLines(path);
      return lines;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  public void draw(Graphics g) {
    for (int i = 0; i < level().size(); i++) {
      for (int j = 0; j < level().size(); j++) {
        if (level().get(j).charAt(i) == '0') {
          Floor image = new Floor(ImageLoader.getInstance().FLOOR ,i, j);
          image.draw(g);
        } else {
          Wall image = new Wall(ImageLoader.getInstance().WALL, i, j);
          image.draw(g);
          isWall = true;
        }
      }
    }
  }
}

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Bálint on 2017. 03. 28..
 */

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the assets/duplicated_chars.txt
    try {
      Path filePath = Paths.get("assets/duplicated-chars.txt");
      List<String> lines = Files.readAllLines(filePath);

      for (String line : lines) {

        System.out.println(line.replaceAll("(.).", "$1"));
        line.replace
      }
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getClass());
    }

  }
}
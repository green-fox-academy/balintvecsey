import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Bálint on 2017. 03. 28..
 */

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts assets/reversed_zen_lines.txt
    try {
      Path filePath = Paths.get("assets/reversed-lines.txt");
      List<String> lines = Files.readAllLines(filePath);

      for (String line : lines) {
        StringBuilder reversed = new StringBuilder(line);
        System.out.println(reversed.reverse());
      }
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getClass());
    }


  }
}
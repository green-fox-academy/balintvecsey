import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Bálint on 2017. 03. 27..
 */

public class Lotto {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lotto numbers assets/lotto.csv

    try {
      Path filePath = Paths.get("assets/otos.csv");
      List<String> lines = Files.readAllLines(filePath);

      ArrayList<String>  lottoNumbers = new ArrayList<>();

      for (String line : lines) {
        String[] splitted = line.split(";");

        for (int i = splitted.length - 5; i < splitted.length; i++) {

          lottoNumbers.add(splitted[i]);
        }
      }

      int[][] sortedCommons = new int[90][2];
      for (int i = 1; i <= 90; i++) {
        sortedCommons[i -1][0] = i;
        sortedCommons[i -1][1] = Collections.frequency(lottoNumbers, Integer.toString(i));
      }

      for (int i = 0; i < sortedCommons.length; i++) {
        for (int j = i; j < sortedCommons.length; j++) {
          if (sortedCommons[i][1] < sortedCommons[j][1]) {
            int[] swap = sortedCommons[i];
            sortedCommons[i] = sortedCommons[j];
            sortedCommons[j] = swap;
          }
        }
      }

      for (int i = 0; i < 5; i++) {
        System.out.println("The " + (i + 1) + ". most common lotto number is: " + sortedCommons[i][0] + '.');
      }

    } catch (Exception e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }

  }
}

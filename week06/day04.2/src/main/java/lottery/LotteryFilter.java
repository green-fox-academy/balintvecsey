package lottery;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

/**
 * Created by Bálint on 2017. 04. 20..
 */
public class LotteryFilter {

  public static void main(String[] args) {
    OptionParser parser = new OptionParser();
    parser.accepts("y");
    parser.accepts("f");
    parser.accepts("o");
    OptionSet optionSet = parser.parse(args);

    CSVReader reader = null;
    try {
      reader = new CSVReader(new FileReader("~/assets/ottos.csv"));
      List<String[]> lines = reader.readAll();

      if (optionSet.has("y")) {}

      if (optionSet.has("f")) {}

      if (optionSet.has("o")) {}

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

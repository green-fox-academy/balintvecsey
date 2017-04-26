package lottery;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bálint on 2017. 04. 26..
 */
public class FileHandler {
  List<String[]> file, temp;

  public FileHandler(){
    file = fileReader();
    temp = new ArrayList<String[]>();
  }

  public List<String[]> fileReader(){
    CSVReader reader = null;
    try {
      reader = new CSVReader(new FileReader("assets/ottos.csv"), ';');
      List<String[]> lines = reader.readAll();
      return lines;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      return null;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  public void fileWriter(String[] args){
    for (String[] line : file) {
      if (line[0].equals(args[1])) {
        temp.add(line);
      }
    }

    CSVWriter writer = null;
    try {
      writer = new CSVWriter(new FileWriter("assets/output.csv"), ';', CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(temp);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

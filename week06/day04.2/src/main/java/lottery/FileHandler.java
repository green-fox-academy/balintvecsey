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
  String input, output;
  static final String FOLDER = "assets/";

  public FileHandler(){
    file = fileReader();
    temp = new ArrayList<String[]>();
    input = "ottos.csv";
    output = "output.csv";
  }

  public FileHandler(String input, String output){
    this.input = input;
    this.output = output;
  }

  public List<String[]> fileReader(){
    CSVReader reader = null;
    try {
      reader = new CSVReader(new FileReader(FOLDER + input), ';');
      List<String[]> lines = reader.readAll();
      return lines;
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getClass());
      return null;
    } catch (IOException e) {
      System.out.println("IO Error: " + e.getClass());
      return null;
    }
  }

  public void fileWriter(String[] args){
    for (String[] line : file) {
      if (line[0].equals(args[0])) {
        temp.add(line);
      }
    }

    CSVWriter writer = null;
    try {
      writer = new CSVWriter(new FileWriter(FOLDER + output), ';', CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(temp);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

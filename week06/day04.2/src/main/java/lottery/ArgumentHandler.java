package lottery;

/**
 * Created by Bálint on 2017. 04. 26..
 */
public class ArgumentHandler {

  public void argumentHandler(String[] args) {
    FileHandler data = new FileHandler();

    if(args.length == 0) {
      System.out.println("Error, please use in this format: -y [year]");
    } else if(args[2].contains("o") || args[4].contains("o")) {

    } else if(args[2].contains("f")) {

    } else if(args[0].contains("y")) {
      data.fileWriter(args);
    }
  }
}

package lottery;

/**
 * Created by Bálint on 2017. 04. 26..
 */
public class ArgumentHandler {

  public void argumentHandler(String[] args) {
    FileHandler data = new FileHandler();

    if(args[0].contains("y")) {
      data.fileWriter(args);
    }
  }
}

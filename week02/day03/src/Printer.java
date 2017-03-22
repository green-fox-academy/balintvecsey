/**
 * Created by Bálint on 2017. 03. 22..
 */
public class Printer {
  //  Create the usual class wrapper
  //  and main method on your own.

  // - Create a function called `printer`
  //   which prints the input String parameters
  //   (can have multiple number of arguments)
  public static void main(String[] args) {
    printerFunction("blabla", " yo yo", " haha");
  }

  public static void printerFunction(String... text) {
    for (String current : text) {
      System.out.print(current);
    }

  }
}

/**
 * Created by Bálint on 2017. 03. 22..
 */
public class Greet {
  //  From now on, create the usual class wrapper
  //  and main method on your own.

  // - Create a string variable named `al` and assign the value `Greenfox` to it
  // - Create a function called `greet` that greets it's input parameter
  //     - Greeting is printing e.g. `Greetings dear, Greenfox`
  // - Greet `al`
  public static void main(String[] args) {
    String al = "Greenfox";
    System.out.println(greetFunction(al));
  }

  public static String greetFunction(String greet) {
    return "Greetings dear, " + greet;

  }
}

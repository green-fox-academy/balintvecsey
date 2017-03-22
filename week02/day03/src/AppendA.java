/**
 * Created by Bálint on 2017. 03. 22..
 */
public class AppendA {

  public static void main(String[] args) {
    //  From now on, create the usual class wrapper
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a string variable named `am` and assign the value `kuty` to it
    // - Write a function called `appendA` that gets a string as an input
    //   and appends an 'a' character to its end
    // - Print the result of `appendA(am)`  }
    String am = "kuty";
    System.out.println(appendAFunction(am));
  }

  public static String appendAFunction(String appendA) {
    return appendA + "a";
  }

}

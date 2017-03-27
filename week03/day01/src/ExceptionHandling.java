/**
 * Created by Bálint on 2017. 03. 27..
 */
public class ExceptionHandling {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};

    try {
      System.out.println(numbers[5]);
    } catch (Exception ex) {
      System.out.println("error class: " + ex.getClass());
    }
  }

}

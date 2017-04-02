import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Bálint on 2017. 04. 02..
 */
public class Trees {

  public static void main(String[] args) {

    ArrayList<String> type = new ArrayList<>(Arrays.asList("oak", "maple", "pine", "willow", "plum"));
    ArrayList<String> leafColor = new ArrayList<>(Arrays.asList("green", "brown", "dark green", "yellow", "green"));
    ArrayList<Integer> age = new ArrayList<>(Arrays.asList(45, 60, 55, 23, 5));
    ArrayList<String> sex = new ArrayList<>(Arrays.asList("male", "male", "female", "female", "female"));

    for (int i = 0; i < 5; i++) {
      System.out.println("This is a(n) " + type.get(i) + " tree, which has " + leafColor.get(i) + " leaves. It's "+
          age.get(i) + " year's old, and it's a "+ sex.get(i) + ".");
    }
  }
}

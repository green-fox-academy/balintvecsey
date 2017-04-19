package SortTheArray;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Bálint on 2017. 04. 19..
 */
public class SortTheArray {

  public static <T extends Number> void sortArray(T[] inputArray) {
    try {
      Arrays.sort(inputArray, Collections.reverseOrder());
      for(T element : inputArray) {
        System.out.printf("%s ", element);
      }
      System.out.println();
    } catch (Exception e){
      System.out.println("Oups, error: " + e.getClass());
    }
  }
}

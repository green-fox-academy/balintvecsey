package SumTheArray;

/**
 * Created by Bálint on 2017. 04. 19..
 */
public class SumTheArray {

  public static <T extends Number> int sumArray(T[] inputArray, int length) {
    int sum = 0;
    try {
      for (int i = 0; i < length; i++) {
        sum += inputArray[i].intValue();
      }
      return sum;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Oups, " + length + " is more than the length of your array.");
      return 0;
    } catch (Exception e){
      System.out.println("Oups, error: " + e.getClass());
      return 0;
    }
  }
}

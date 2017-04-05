import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Created by Bálint on 2017. 04. 05..
 */
public class SumTest {

  @org.junit.Test
  public void getSum() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(4);
    Sum sum = new Sum(numbers);

    assertEquals(7, sum.getSum());
  }

}
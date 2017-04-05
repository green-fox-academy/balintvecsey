import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;

/**
 * Created by Bálint on 2017. 04. 05..
 */
public class SumTest {

  @org.junit.Test
  public void TestFirst() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(4);
    Sum sum = new Sum(numbers);

    assertEquals(7, sum.getSum());
  }

  @Test
  public void TestEmpty() {
    ArrayList<Integer> numbers = new ArrayList<>();
    Sum sum = new Sum(numbers);

    assertEquals(0, sum.getSum());
  }

  @Test
  public void TestOneE() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    Sum sum = new Sum(numbers);

    assertEquals(3, sum.getSum());
  }

  @Test
  public void TestMultipleE() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(23);
    numbers.add(7);
    numbers.add(12);
    Sum sum = new Sum(numbers);

    assertEquals(42, sum.getSum());
  }

  @Test
  public void TestNull() {
    ArrayList<Integer> numbers = null;
    Sum sum = new Sum(numbers);

    assertEquals(0, sum.getSum());
  }
}

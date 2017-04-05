import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by Bálint on 2017. 04. 05..
 */
public class FibonacciTest {

  @Test
  public void Test1() {
    Fibonacci number = new Fibonacci();
    assertEquals(1, number.fibonum(1));
  }

  @Test
  public void Test2() {
    Fibonacci number = new Fibonacci();
    assertEquals(1, number.fibonum(2));
  }

  @Test
  public void Test3() {
    Fibonacci number = new Fibonacci();
    assertEquals(1597, number.fibonum(17));
  }
}

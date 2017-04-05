import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by Bálint on 2017. 04. 05..
 */
public class FibonacciTest {

  @Test
  public void TestWith1() {
    Fibonacci number = new Fibonacci();
    assertEquals(1, number.fibonum(1));
  }

  @Test
  public void TestWith2() {
    Fibonacci number = new Fibonacci();
    assertEquals(1, number.fibonum(2));
  }

  @Test
  public void TestWithN() {
    Fibonacci number = new Fibonacci();
    assertEquals(1597, number.fibonum(17));
  }

  @Test
  public void TestWithNegative() {
    Fibonacci number = new Fibonacci();
    assertEquals(-1, number.fibonum(-7));
  }
}

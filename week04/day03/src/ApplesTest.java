import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by Bálint on 2017. 04. 05..
 */
public class ApplesTest {

  @Test
  public void getApple() {
    Apples apples1 = new Apples("apple1");
    assertEquals("apple", apples1.getApple());
  }
}

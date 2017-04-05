import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;

/**
 * Created by Bálint on 2017. 04. 05..
 */
public class CountTest {

  @Test
  public void countLettersTest() {
    Count count = new Count();
    HashMap<Character, Integer> myhash = new HashMap<>();
    myhash.put('a', 2);
    myhash.put('l', 1);
    myhash.put('m', 1);

    assertEquals(myhash, count.countLetters("alma"));
  }
}

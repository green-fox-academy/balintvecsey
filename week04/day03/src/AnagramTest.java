import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by Bálint on 2017. 04. 05..
 */
public class AnagramTest {

  @Test
  public void TestTrue() {
    Anagram a = new Anagram();
    assertEquals(true, a.checkAnagram("baba", "abba"));
  }

  @Test
  public void TestFalse() {
    Anagram a = new Anagram();
    assertEquals(false, a.checkAnagram("baba", "dada"));
  }

  @Test
  public void TestUppercase() {
    Anagram a = new Anagram();
    assertEquals(true, a.checkAnagram("BAba", "abba"));
  }
}

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by Bálint on 2017. 04. 05..
 */
public class Count {

  public HashMap<Character, Integer> countLetters(String word){
    HashMap<Character, Integer> occurance = new HashMap<>();

    char[] chars = word.toLowerCase().toCharArray();

    for (int i = 0; i < chars.length; i++) {
      if (occurance.containsKey(chars[i])) {
        occurance.replace(chars[i], occurance.get(chars[i]) + 1);
      } else {
        occurance.put(chars[i], 1);
      }
    }
    return occurance;
  }
}

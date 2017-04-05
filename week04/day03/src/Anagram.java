import java.util.Arrays;

/**
 * Created by Bálint on 2017. 04. 05..
 */
public class Anagram {

  public boolean checkAnagram(String word1, String word2){
    char[] chars1 = word1.toLowerCase().toCharArray();
    char[] chars2 = word2.toLowerCase().toCharArray();
    Arrays.sort(chars1);
    Arrays.sort(chars2);
    boolean isAnagram = false;

    if (Arrays.toString(chars1).equals(Arrays.toString(chars2))) {
      isAnagram = true;
    }
    return isAnagram;
  }
}

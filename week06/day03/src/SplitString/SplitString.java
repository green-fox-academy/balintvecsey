package SplitString;

/**
 * Created by Bálint on 2017. 04. 19..
 */
public class SplitString {

  public String[] splitString(String string, int index) {
    String[] splitted = new String[2];
    try {
      splitted[0] = string.substring(0, index);
      splitted[1] = string.substring(index, string.length());
      return splitted;
    } catch (IndexOutOfBoundsException e){
      return null;
    }
  }
}

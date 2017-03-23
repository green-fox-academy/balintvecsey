/**
 * Created by Bálint on 2017. 03. 23..
 */
import java.util.*;

public class AppendLetter{
  public static void main(String... args){
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    // Add "a" to every string in the far list.

    far.set(0, "kutya");
    far.set(1, "macska");
    far.set(2, "kacsa");
    far.set(3, "róka");
    far.set(4, "halacska");
    System.out.println(far);
  }
}

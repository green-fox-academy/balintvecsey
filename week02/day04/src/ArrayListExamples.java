import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Bálint on 2017. 03. 23..
 */
public class ArrayListExamples {

  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList(Arrays.asList(1, 2, 4));

    list1.add(2, 3);
    list1.set(2, 4);
    System.out.println("Size of the array list: " + list1.size());
    System.out.println("First element: " + list1.get(0));
    System.out.println(list1);

    String sentence = "first part second part";
    String firstPart = sentence.substring(0, 10);
    String secondPart = sentence.substring(11);

    String replaceSting = sentence.replace('f', 'e');
    System.out.println("Replaced string: " + replaceSting);

    System.out.println(firstPart);
    System.out.println(secondPart);

    System.out.println("Character at index 0: " + sentence.charAt(0));

    HashMap<String, Integer[]> classExamResults = new HashMap<>();
    Integer[] norbisResults = {5, 5, 5};
    Integer[] dorisResults = {5, 2, 5};
    classExamResults.put("Norbi", norbisResults);
    classExamResults.put("Dori", dorisResults);

    System.out.println("Norbi's exam results: " + Arrays.toString(classExamResults.get("Norbi")));
  }
}

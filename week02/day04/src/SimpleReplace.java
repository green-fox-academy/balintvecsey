/**
 * Created by Bálint on 2017. 03. 23..
 */
public class SimpleReplace {
  public static void main(String... args){
    String example = "In a dishwasher far far away";
    String replacedExample = example.replace("dishwasher", "galaxy");


    // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
    // Please fix it for me!
    // Expected ouput: In a galaxy far far away

    System.out.println(replacedExample);
  }
}

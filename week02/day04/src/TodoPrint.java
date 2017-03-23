/**
 * Created by Bálint on 2017. 03. 23..
 */
public class TodoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo
    String myTodo = "My todo:\n";
    String download = " - Download games\n";
    String diablo = "    - Diablo";

    myTodo = myTodo + todoText + download + diablo;

    System.out.println(myTodo);
  }
}

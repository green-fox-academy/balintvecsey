import java.util.ArrayList;

/**
 * Created by Bálint on 2017. 04. 05..
 */
public class Sum{

  public ArrayList<Integer> numbers;
  int sum;

  public Sum(ArrayList<Integer> numbers){
    this.numbers = numbers;
  }

  public int getSum(){
    for (int i = 0; i < numbers.size(); i++) {
      sum += numbers.get(i);
    }
    return sum;
  }
}

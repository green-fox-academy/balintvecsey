/**
 * Created by Bálint on 2017. 04. 03..
 */
    /*Create Counter class
    which has an integer field value
    when creating it should have a default value 0 or we can specify it when creating
    we can add(number) to this counter another whole number
    or we can add() without parameters just increasing the counter's value by one
    and we can get() the current value
    also we can reset() the value to the initial value*/

public class Counter {
  int a;
  int current;

  public Counter() {
    a = 0;
    current = a;
  }

  public Counter(int a){
    this.a = a;
    this.current = a;
  }

  public void add(int number){
    current =+ number;
  }

  public void add(){
    current++;
  }

  public int get(){
    return current;
  }

  public void reset(){
    current = a;
  }
}

/**
 * Created by Bálint on 2017. 04. 03..
 */
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

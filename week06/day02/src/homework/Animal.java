package homework;

/**
 * Created by Bálint on 2017. 04. 17..
 */
public class Animal {
  String name;
  int age;
  int wight;
  String gender;

  public Animal(String name){
    this.name = name;
  }

  public void greet(){}

  public String wantChild(){
    return "want a child from an egg!";
  }

  public String getName(){
    return name;
  }

  public void eat(){}

  public void sleep(){}

  public void move(){}

}

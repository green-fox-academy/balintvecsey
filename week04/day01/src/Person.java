/**
 * Created by Bálint on 2017. 04. 03..
 */
public class Person {
  String name;
  String eyeColor;
  float children;

  public Person(String name) {
    this.name = name;
  }

  void putInLenses(String color) {
    eyeColor = color;
  }

  void baptism(String name) {
    this.name = name;
  }
}

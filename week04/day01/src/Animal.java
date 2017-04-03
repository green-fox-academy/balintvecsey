/**
 * Created by Bálint on 2017. 04. 03..
 */
public class Animal {
  int hunger;
  int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    hunger --;
  }

  public void drink() {
    thirst --;
  }

  public void play() {
    hunger --;
    thirst --;
  }

  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.eat();
    animal.eat();
    animal.drink();
    animal.play();
    System.out.println(animal.hunger);
  }
}

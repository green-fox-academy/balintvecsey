package homework;

/**
 * Created by Bálint on 2017. 04. 17..
 */
public class Mammal extends Animal {

  public Mammal(String name) {
    super(name);
  }

  public String wantChild(){
    return "want a child from my uterus!";
  }
}

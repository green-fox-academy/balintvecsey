package main.java.music;

/**
 * Created by Bálint on 2017. 04. 18..
 */
public class Violin extends StringedInstrument {
  String name = "Violin";

  public Violin(){
    numberOfStrings = 4;
  }

  public Violin(int numberOfStrings){
    super(numberOfStrings);
  }

  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, "screeches");
  }
}

package main.java.music;

/**
 * Created by Bálint on 2017. 04. 18..
 */
public class ElectricGuitar extends StringedInstrument {
  String name = "Electric Guitar";

  public ElectricGuitar(){
    numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings){
    super(numberOfStrings);
  }

  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings,"twangs");
  }
}

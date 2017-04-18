package main.java.music;

/**
 * Created by Bálint on 2017. 04. 18..
 */
public class BassGuitar extends StringedInstrument {
  String name = "Bass Guitar";

  public BassGuitar(){
    numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings){
    super(numberOfStrings);
  }

  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, "Duum-duum-duum");
  }
}

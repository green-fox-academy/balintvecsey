package main.java.music;

/**
 * Created by Bálint on 2017. 04. 18..
 */
abstract public class StringedInstrument extends Instrument {
  int numberOfStrings;
  final String formatForPlay ="%s, a %d-stringed instrument that %s.\n";

  public StringedInstrument(){}

  public StringedInstrument(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
  }
}

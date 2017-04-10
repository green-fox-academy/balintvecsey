import javax.xml.stream.events.Characters;

/**
 * Created by Bálint on 2017. 04. 10..
 */
public class Character {
  int maxHP;
  int currentHP;
  int defendP;
  int strikeP;

  public Character() {}

  public Character(int maxHP, int currentHP, int defendP, int strikeP) {
    this.maxHP = maxHP;
    this.currentHP = currentHP;
    this.defendP = defendP;
    this.strikeP = strikeP;
  }

}

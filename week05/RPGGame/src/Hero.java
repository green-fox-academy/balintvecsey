/**
 * Created by Bálint on 2017. 04. 10..
 */
public class Hero extends GameObjects {

  public Hero(String filename, int posX, int posY) {
    super(filename, posX, posY);
  }

  public void moveUp() {
    this.posY --;
    setImage("assets/hero-up.png");
  }

  public void moveDown() {
    this.posY ++;
    setImage("assets/hero-down.png");
  }

  public void moveLeft() {
    this.posY --;
    setImage("assets/hero-left.png");
  }

  public void moveRight() {
    this.posY ++;
    setImage("assets/hero-right.png");
  }
}

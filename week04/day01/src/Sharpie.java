/**
 * Created by Bálint on 2017. 04. 03..
 */
public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use() {
    inkAmount --;
  }

  public static void main(String[] args) {
    Sharpie sharpie = new Sharpie("Brown", 12);
    sharpie.use();
    System.out.println(sharpie.inkAmount);
  }
}

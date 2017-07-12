public class Algorithm {

  public static void main(String[] args) {
    System.out.println(sumOfTheMultiplesOf3and5(1000));
  }

  public static int sumOfTheMultiplesOf3and5(int range) {
    int sum = 0;

    for (int i = 0; i < range; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}

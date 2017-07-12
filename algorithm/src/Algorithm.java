public class Algorithm {

  public static void main(String[] args) {
    System.out.println(sumOfTheMultiplesOf3and5(1000));
    System.out.println(sumOfTheEvenFibonacciNumbers());
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

  public static int sumOfTheEvenFibonacciNumbers() {
    int sum = 0;

    for (int i = 1; i < 34; i++) {
      long currentFibonum = fibonum(i);

      if (currentFibonum % 2 == 0) {
        sum += currentFibonum;
      }
    }
    return sum;
  }

  public static int fibonum(int n) {
    if (n < 0) {
      return -1;
    } else if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fibonum(n - 1) + fibonum(n - 2);
    }
  }
}

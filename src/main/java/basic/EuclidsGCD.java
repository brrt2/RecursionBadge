package basic;

public class EuclidsGCD {

  public static void main(String[] args) {

    System.out.println(computeEuclidsGCDRecursively(54, 24));
    System.out.println(computeEuclidsGCDIteratively(54, 24));

  }


  private static int computeEuclidsGCDRecursively(int x, int y) {

    if (y == 0) return x;

    return computeEuclidsGCDRecursively(y, x % y);
  }

  private static int computeEuclidsGCDIteratively(int x, int y) {
    while (y != 0) {
      int temp = y;
      y = x % y;
      x = temp;
    }
    return x;
  }

}

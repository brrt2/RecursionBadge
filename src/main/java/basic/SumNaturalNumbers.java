package basic;

public class SumNaturalNumbers {


  public static void main(String[] args) {

    System.out.println("Sum of natural numbers recursively: " + sumNaturalNumbersRecursively(15));
    System.out.println("Sum of natural numbers iteratively: " + sumNaturalNumbersIteratively(15));
  }


  private static int sumNaturalNumbersRecursively(int n) {

    if ( n == 0) return n;

    return n + sumNaturalNumbersRecursively(n-1);

  }

  private static int sumNaturalNumbersIteratively(int n) {

    int result =0;

    for (int i = n; i > 0; i--) {
      result+=i;
    }

    return result;
  }

}

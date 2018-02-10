package basic;

public class FactorialFunction {

  public static void main(String[] args) {

    System.out.println("Factorial recursively : " + computeFactorialRecursively(6));
    System.out.println("Factorial recursively : " + computeFactorialIteratively(6));

  }

  private static int computeFactorialRecursively(int n) {

    if( n == 0) return 1;
    if( n == 1 ) return 1;

    return n * computeFactorialRecursively(n-1);
  }


  private static int computeFactorialIteratively(int n) {
    int result = 1;

    for (int i = n; i > 0; i--) {
      result*=i;
    }

    return result;
  }

  // TODO : factorial with streams

}

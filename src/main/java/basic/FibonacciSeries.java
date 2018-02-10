package basic;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class FibonacciSeries {

  public static void main(String[] args) {

    System.out.println("Iterative Fibonacci series : " + computeFibonacciIteratively(6));
    System.out.println("Recursive Fibonacci series : " + computeFibonacciRecursively(6));
    System.out.println("Fibonacci series with streams : " + computeFibonacciWithStreams(6));
  }

  private static int computeFibonacciIteratively(int n) {

    int[] theArray = new int[200];
    theArray[0] = 0;
    theArray[1] = 1;
    theArray[2] = 1;

    for (int i = 3; i < theArray.length; i++) {
      theArray[i] = theArray[i-1] + theArray[i-2];
    }
    return theArray[n];
  }

  private static int computeFibonacciRecursively(int n) {

    if (n == 0) return 0;
    if (n == 1) return 1;

    return computeFibonacciRecursively(n-1) + computeFibonacciRecursively(n-2);
  }

  private static BigDecimal computeFibonacciWithStreams(int n) {

   BigDecimal result = Stream.iterate((new BigDecimal[]{BigDecimal.ZERO,BigDecimal.ONE}),p -> new BigDecimal[] {
            p[1],p[0].add(p[1])}).limit(n).skip(n -1).findFirst().get()[1];

    return result;
  }

}

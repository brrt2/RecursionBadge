package other;

import java.util.Arrays;

public class FindMinimumMaximum {

  public static void main(String[] args) {

    int[] arrayToCheck = new int[]{15,2,3,5,3,0,2,15,1,9};

    System.out.println(findMinimum(arrayToCheck,0));
  }


  private static int findMinimum(int[] theArray, int n) {

    if(theArray.length == 0 )return 0;
    if(theArray.length == 1) return theArray[0];

    return 0;

  }



}

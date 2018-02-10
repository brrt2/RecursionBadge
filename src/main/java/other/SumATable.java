package other;

import java.util.Arrays;

public class SumATable {

  public static void main(String[] args) {

    int[] arrayToCheck = {1,2,3,4,5};

    System.out.println("The sum of the array : " + sumAtable(arrayToCheck));

  }

  private static int sumAtable(int[] theArray) {

    if(theArray.length == 0) return 0;
    if(theArray.length == 1 ) return theArray[0];
    return theArray[0]+theArray[theArray.length-1]+sumAtable(Arrays.copyOfRange(theArray,1,theArray.length-1));

  }

}

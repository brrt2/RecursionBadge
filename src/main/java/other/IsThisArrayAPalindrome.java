package other;

import java.util.Arrays;

public class IsThisArrayAPalindrome {

  public static void main(String[] args) {

    int[] arrayToCheck = {1,2,3,10,3,2,1,5};

    System.out.println("Is this array a palindrome : " + isArrayAPalindrome(arrayToCheck));

  }

  private static boolean isArrayAPalindrome(int[] theArray) {

    if(theArray.length <= 1) return true;
    if(theArray[0] != theArray[theArray.length-1]) return false;
    return isArrayAPalindrome(Arrays.copyOfRange(theArray,1,theArray.length-1));
  }
}

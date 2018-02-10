package other;

public class IsThisStringAPalindrome {

  public static void main(String[] args) {

    String wordToCheck = "rentner";

    System.out.println("Is this word a palindrome ? : " + isPalindrome(wordToCheck));
    System.out.println("Is this word a palindrome ? : " + isPalindromeWithLoop(wordToCheck));
    System.out.println("Is this word a palindrome ? : " + isPalindromeRecursively(wordToCheck));
  }

  private static boolean isPalindromeRecursively(String s) {
    System.out.println(s);
    if(s.length() <=1) return true;
    if(s.charAt(0)!=s.charAt(s.length()-1)) return false;
    return isPalindromeRecursively(s.substring(1,s.length()-1));
  }

  private static boolean isPalindrome(String s) {
    return new StringBuilder(s).reverse().toString().equals(s);
  }

  private static boolean isPalindromeWithLoop(String s) {
    for (int i = 0; i < s.length()/2; i++) {
      if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
    }
    return true;
  }

}

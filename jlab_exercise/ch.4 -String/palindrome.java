public class Palindrome {
  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal, Panama.")); // true
    System.out.println(isPalindrome("08-9122-1980"));                    // true
    System.out.println(isPalindrome("Vaja java"));                       // false
  }
  //---------------------------------------------  
  public static boolean isPalindrome(String t) {
    String out = "";
    for (char i : t.toCharArray()) {
      if (!Character.isLetterOrDigit(i)) continue;
      String go = "" + i;
      out += go;
    }
    return out.equalsIgnoreCase(new StringBuilder(out).reverse().toString()) ? true : false;
  }
  //---------------------------------------------
}

import java.util.Scanner;

public class CheckDigit {
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("รหัสประจำตัวประชาชน 12 หลักซ้าย = ");
    String id = kb.next();

    int sum = 0;
    int run = 13;
    
    for (char c : id.toCharArray()) {
      sum += (Character.getNumericValue(c) * run);
      run--;
    }
    int digit = 11 - (sum % 11);
    if (digit <= 9) System.out.println("check digit = " + digit);
    else {
      String i = Integer.toString(digit);
      String out = i.substring(i.length() - 1);
      System.out.println("check digit = "+out);
    }  
  }

}

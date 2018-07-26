import java.util.Scanner;

public class Plural {
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("singular noun = ");
    String s = kb.next();
    
    String check1 = "";
    String check2 = "";
    String out = "";
    
    check1 = s.substring(s.length() - 1);
    check2 = s.substring(s.length() - 2);
    if (check1.equalsIgnoreCase("s") || check1.equalsIgnoreCase("x") ||
        check2.equalsIgnoreCase("ch"))
        out = s +"es";
    else if (check1.equalsIgnoreCase("y")) {
      String j = s.substring(s.length() - 2, s.length() - 1);
      String vowel = "aeiouAEIOU";
      if (!vowel.contains(j))
        out += s.substring(0, s.length() - 1) + "ies";
      else
        out += s + "s";
    }
    else
      out += s + "s";
    
    System.out.println("plural = " + out);
  }

}

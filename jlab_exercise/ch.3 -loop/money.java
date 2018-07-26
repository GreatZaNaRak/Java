import java.util.Scanner;

public class Money {
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("money = ");
    int money = kb.nextInt();
    String m = Integer.toString(money);
    String head = "";
    if (m.indexOf("-") != -1) {
      head = m.substring(0, 1);
      m = m.substring(1);
    }
    m = new StringBuilder(m).reverse().toString();
    int c = 0;
    String out = "";
    for (char i : m.toCharArray()) {
      String j = "" + i;
      c++;
      out += j;
      if (c % 3 == 0 && m.indexOf(j,c-1) != m.length() - 1) out += ",";
    }
    out = new StringBuilder(out).reverse().toString();
    System.out.println(head+out);
    
  }

}

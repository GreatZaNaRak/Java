import java.util.Scanner;

public class Utils {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("n = ");
    int n = kb.nextInt();
    System.out.print("m = ");
    int m = kb.nextInt();
    
    while (m > 0) {
      int t = n % m;
      n = m;
      m = t;
    }
    int gcd = n;
    System.out.println("gcd = "+gcd);
  }
}

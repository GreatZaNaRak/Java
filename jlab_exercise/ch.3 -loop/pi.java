import java.util.Scanner;

public class Pi {
  // pi1 = 4*(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
  // pi2 = 4*(2/3 * 4/3 * 4/5 * 6/5 * 6/7 * 8/7 * ...)
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("k = ");
    int k = kb.nextInt();

    double pi1 = 0, pi2 = 0;
    
    int i = 0;
    int run1 = 1;
    for (int j = 0; j < k; j++) {
      if (i % 2 == 0) pi1 += (1.0 / run1);
      else pi1 -= (1.0 / run1);
      i++;
      run1 += 2;
    }
    double pre = 2.0;
    double sub = 3.0;
    int k1 = 1;
    int k2 = 0;
    pi2 = 1;
    for (int j = 0; j < k; j++) {
      pi2 *= (pre / sub);
      k1++;
      k2++;
      if (k1 % 2 == 0) pre += 2.0;
      if (k2 % 2 == 0) sub += 2.0;
    }
    
    pi1 *= 4;
    pi2 *= 4;
    
    System.out.println("Pi = " + pi1);  // แสดงผลของสูตรแรก
    System.out.println("Pi = " + pi2);  // แสดงผลของสูตรที่สอง
  }

}

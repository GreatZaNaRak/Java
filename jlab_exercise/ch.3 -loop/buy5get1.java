import java.util.Scanner;

public class Buy5Get1 {
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in).useDelimiter("\\s*[,\\s]\\s*");
    System.out.print("ÃÒ¤ÒÊÔ¹¤éÒ·Ñé§Ë¡ = ");
    double a1 = kb.nextDouble();
    double a2 = kb.nextDouble();
    double a3 = kb.nextDouble();
    double a4 = kb.nextDouble();
    double a5 = kb.nextDouble();
    double a6 = kb.nextDouble();
    double[] g = { a1, a2, a3, a4, a5, a6 };
    double min = 1000;
    for (int i = 0; i < g.length; i++) {
      if (g[i] < min) min = g[i];
    }
    System.out.println("ราคารวมทั้งหกชิ้น = " + (a1 + a2 + a3 + a4 + a5 + a6));
    System.out.println("หักราคาสินค้าชิ้นน้อยสุด = " + min);
    System.out.println("เป็นเงิน = " + ((a1 + a2 + a3 + a4 + a5 + a6) - min) );
  }

}

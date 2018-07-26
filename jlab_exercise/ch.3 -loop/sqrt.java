import java.util.Scanner;

public class SquareRoot {

  public static void main(String[] args) {
    //   ตัวอย่าง
    //   x = 0.16
    //   sqrt(x) = 0.4000000000013423
    //
    // อย่าลืมใช้ kb.nextDouble() เพื่ออ่านจำนวน double จากเป็นพิมพ์
    
    Scanner kb = new Scanner(System.in);
    System.out.print("x = ");
    double x = kb.nextDouble();
    double r = x;
    while (Math.abs(r*r - x)/(Math.max(r*r,x)) > Math.pow(10,-10)) {
      r = (r + x / r) / 2;
    }
   
    System.out.println("sqrt(x) = "+r);

  }

}

import java.util.Scanner;

public class SignFinder {
  
  public static void main(String[] args) {
    // การสร้าง Scanner ข้างล่างนี้ทำให้ผู้ใช้สามารถป้อนจำนวนแต่ละตัว คั่นด้วย , ได้
    Scanner kb = new Scanner(System.in).useDelimiter("\\s*[,\\s]\\s*");
    System.out.print("จำนวนทั้งสาม = ");
    int a = kb.nextInt();
    int b = kb.nextInt();
    int c = kb.nextInt();

    String sign = "";   // ใช้เครื่องหมาย + - x และ /
    if (a + b == c) sign = "+";
    else if (a - b == c) sign = "-";
    else if (a * b == c) sign = "x";
    else sign = "/";


    
    System.out.println("เครื่องหมายที่ต้องการคือ " + sign);

  }

}

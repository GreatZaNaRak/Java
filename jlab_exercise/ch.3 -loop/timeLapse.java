import java.util.Scanner;

public class TimeLapse {
  
  public static void main(String[] args) {
    // การสร้าง Scanner ข้างล่างนี้ทำให้ผู้ใช้สามารถป้อนจำนวนแต่ละตัว คั่นด้วย , ได้
    Scanner kb = new Scanner(System.in).useDelimiter("\\s*[,\\s]\\s*");
    System.out.print("เวลาเริ่มต้น = ");
    int h1 = kb.nextInt();
    int m1 = kb.nextInt();
    System.out.print("เวลาสิ้นสุด = ");
    int h2 = kb.nextInt();
    int m2 = kb.nextInt();

    int dh = 0;
    int dm = 0;
    
    if (m1 < m2) {
      dm = m2 - m1;
      if (h1 < h2) dh = h2 - h1;
      else if (h1 == h2) dh = 0;
      else dh = (12 - h1) + h2;
    }
    else if (m1 == m2) {
      dm = 0;
      if (h1 < h2) dh = h2 - h1;
      else if (h1 == h2) dh = 0;
      else dh = (12 - h1) + h2;
    } 
    else {
      dm = (60 - m1) + m2;
      h1 += 1;
      if (h1 < h2) dh = h2 - h1;
      else if (h1 == h2) dh = 0;
      else dh = (12 - h1) + h2;
    } 
    System.out.println("ผลต่าง = " + dh + " ชั่วโมง " + dm + " นาที");
    
  }

}

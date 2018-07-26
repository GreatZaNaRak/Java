import java.util.Scanner;

public class TenLines {
  // เพิ่ม main method เพื่อรับข้อความจากผู้ใช้ จากนั้นแสดงข้อความนั้นซ้ำ ๆ กัน 10 บรรทัด
  // ภายในเครื่องหมาย " "
  // คำเตือน :
  //   ต้องการแสดงเครื่องหมาย " ให้ใช้ \" เช่น System.out.println("\"") คือการแสดง " หนึ่งตัว
  //   อย่าแสดงข้อความอื่นนอกเหนือคำสั่ง
  //   ตอนเริ่มต้นที่แสดงข้อความ บอกให้ผู้ใช้ใส่ข้อความนั้น อย่าขึ้นบรรทัดใหม่ (ใช้ print ไม่ใช่ println)
  //
  // อย่าลืม เขียนเสร็จ ต้องการสั่งทำงาน กด F5, แต่ถ้าต้องการให้ระบบตรวจและให้คะแนน กด F6

  public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    System.out.print("กรุณาใส่ข้อความ = ");
    String a = k.nextLine();
    for (int i = 0; i < 10; i++) {
      System.out.println("\""+a+"\"");
    }

  }

}

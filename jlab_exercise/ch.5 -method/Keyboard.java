import java.util.Scanner;

public class Keyboard {
 
  public static void main(String[] args) {
    
    int n = Keyboard.readInt("n = ");
    double x = Keyboard.readDouble("x = ");
    String s = Keyboard.readLine("text = ");
  }  
  
  public static int readInt() {
    Scanner kb = new Scanner(System.in);
    while (true) {
      String get = kb.nextLine();
      if (!isInteger(get)) System.out.println("** ไม่ใช่จำนวนเต็ม ป้อนใหม่ **");
      else return Integer.parseInt(get);
    }
  }
  // ถ้ารับมาไม่ใช่จำนวนเต็ม ให้แสดง "** ไม่ใช่จำนวนเต็ม ป้อนใหม่ **"
  // Integer.parseInt เพื่อแปลงสตริงเป็นจำนวนเ็ม int   
  public static int readInt(String prompt) {
    Scanner kb = new Scanner(System.in);
    while (true) {
      System.out.print(prompt);
      String get = kb.nextLine();
      if (!isInteger(get)) System.out.println("** ไม่ใช่จำนวนเต็ม ป้อนใหม่ **");
      else return Integer.parseInt(get);
    }    
  }
  // ถ้ารับมาไม่ใช่จำนวนเต็ม ให้แสดง "** ไม่ใช่จำนวน ป้อนใหม่ **"
  // Double.parseDouble เพื่อแปลงสตริงเป็นจำนวน double
  public static double readDouble() {
    Scanner kb = new Scanner(System.in);
    while (true) {
      String get = kb.nextLine();
      if (!isDouble(get)) System.out.println("** ไม่ใช่จำนวน ป้อนใหม่ **");
      else return Double.parseDouble(get);
    }
  }
  public static double readDouble(String prompt) {
    Scanner kb = new Scanner(System.in);
    while (true) {
      System.out.print(prompt);
      String get = kb.nextLine();
      if (!isDouble(get)) System.out.println("** ไม่ใช่จำนวน ป้อนใหม่ **");
      else return Double.parseDouble(get);
    }    
  }
  public static String readLine() {
    Scanner kb = new Scanner(System.in);
    String get = kb.nextLine();
    return get;
  }
  public static String readLine(String prompt) {
    Scanner kb = new Scanner(System.in);
    System.out.print(prompt);
    String get = kb.nextLine();
    return get;
  }
  //--------------------------------------------
  // เมท๊อดที่ไว้ใช้ตรวจสอบว่าสตริง s สามารถแปลงเป็นจำนวนเต็มได้หรือไม่
  private static boolean isInteger(String s) {
    boolean ok;
    try {
      Integer.parseInt(s);
      ok = true;
    } catch (NumberFormatException e) {
      ok = false;
    }
    return ok;
  }
  //--------------------------------------------
  // เมท๊อดที่ไว้ใช้ตรวจสอบว่าสตริง s สามารถแปลงเป็นจำนวน double ได้หรือไม่
  private static boolean isDouble(String s) {
    boolean ok;
    try {
      Double.parseDouble(s);
      ok = true;
    } catch (NumberFormatException e) {
      ok = false;
    }
    return ok;
  }
  //--------------------------------------------


}

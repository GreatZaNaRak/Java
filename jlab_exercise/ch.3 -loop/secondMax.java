import java.util.Scanner;

public class SecondMax {
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String check = "";
    int count = 0;
    while (true) {
      System.out.print("ข้อมูล = ");
      int i = kb.nextInt();
      if (i == 0) break;
      check += i + " ";
      count++;
    }
    if (count < 2) {
      System.out.println("จำนวนที่มากสุดเป็นอันดับสอง = ????");
      return;
    }
    String[] get = check.split(" ");
    int max = 0;
    for (int i = 0; i < get.length; i++) {
      if (Integer.parseInt(get[i]) > max) max = Integer.parseInt(get[i]);
    }
    int finalr = 0;
    for (int i = 0; i < get.length; i++) {
      if (Integer.parseInt(get[i]) > finalr && Integer.parseInt(get[i]) < max) finalr = Integer.parseInt(get[i]);
    }
    int check1 = 0;
    String go = get[0];
    for (int i = 0; i < get.length; i++) {
      if (go.equalsIgnoreCase(get[i])) check1++;
    }
    if (check1 == get.length)
      System.out.println("จำนวนที่มากสุดเป็นอันดับสอง = ????");
    else
      System.out.println("จำนวนที่มากสุดเป็นอันดับสอง = "+finalr);
  }


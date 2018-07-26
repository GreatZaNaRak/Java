import java.util.Scanner;

public class SongkranDay {
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("ปี พ.ศ. = ");
    int year = kb.nextInt();
    year = year - 543;
    int y = Integer.parseInt(Integer.toString(year).substring(2));
    int d = (y + y / 4 + 11) % 7;
    String[] day = new String[] { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    year += 543;
    
    System.out.println("วันสงกรานต์ของปี พ.ศ. " + year + " คือ " + day[d]);
  }

}

import java.util.Scanner;

public class DateFormat {
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in).useDelimiter("\n");
    System.out.print("date (เช่น December 16, 2003) = ");
    String date = kb.next();
    String d, m1, m= "", y;
    
    m1 = date.substring(0, date.indexOf(" ")).trim();
    d = date.substring(date.indexOf(" ")+1, date.indexOf(", ")).trim();
    y = date.substring(date.indexOf(", ")+1).trim();
    
    if (m1.equalsIgnoreCase("january"))  m = "1";
    else if (m1.equalsIgnoreCase("february")) m = "2";
    else if (m1.equalsIgnoreCase("march")) m = "3";
    else if (m1.equalsIgnoreCase("april")) m = "4";
    else if (m1.equalsIgnoreCase("may")) m = "5";
    else if (m1.equalsIgnoreCase("june")) m = "6";
    else if (m1.equalsIgnoreCase("july")) m = "7";
    else if (m1.equalsIgnoreCase("august")) m = "8";
    else if (m1.equalsIgnoreCase("september")) m = "9";
    else if (m1.equalsIgnoreCase("october")) m = "10";
    else if (m1.equalsIgnoreCase("november")) m = "11";
    else if (m1.equalsIgnoreCase("december")) m = "12";

    System.out.println(d+"/"+m+"/"+y);
    
  }

}

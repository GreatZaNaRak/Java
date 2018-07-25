import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("จำนวนนักเรียนที่ได้ A = ");
	    int a = kb.nextInt();
	    System.out.print("จำนวนนักเรียนที่ได้ B+ = ");
	    int bp = kb.nextInt();
	    System.out.print("จำนวนนักเรียนที่ได้ B = ");
	    int b = kb.nextInt();
	    System.out.print("จำนวนนักเรียนที่ได้ C+ = ");
	    int cp = kb.nextInt();
	    System.out.print("จำนวนนักเรียนที่ได้ C = ");
	    int c = kb.nextInt();
	    System.out.print("จำนวนนักเรียนที่ได้ D+ = ");
	    int dp = kb.nextInt();
	    System.out.print("จำนวนนักเรียนที่ได้ D = ");
	    int d = kb.nextInt();
	    System.out.print("จำนวนนักเรียนที่ได้ F = ");
	    int f = kb.nextInt();
	    
	    double classGPA ;
	    classGPA = (a*4.0+bp*3.5+b*3.0+cp*2.5+c*2.0+dp*1.5+d*1.0)/(a+bp+b+cp+c+dp+d+f);
	    System.out.println("Class GPA = " + classGPA);
	}
}

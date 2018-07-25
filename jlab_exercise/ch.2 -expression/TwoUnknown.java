import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
	    System.out.print("a11 = ");
	    double a11 = kb.nextDouble();
	    System.out.print("a12 = ");
	    double a12 = kb.nextDouble();
	    System.out.print("a21 = ");
	    double a21 = kb.nextDouble();
	    System.out.print("a22 = ");
	    double a22 = kb.nextDouble();
	    System.out.print("b1 = ");
	    double b1 = kb.nextDouble();
	    System.out.print("b2 = ");
	    double b2 = kb.nextDouble();
	    
	    double x1, x2;
	    x2 = (b1*a21 - a11*b2)/(a12*a21 - a11*a22);
	    x1 = (b1 - a12*x2)/a11;
	    
	    System.out.println("x1 = " + x1);
	    System.out.println("x2 = " + x2);
	}
}

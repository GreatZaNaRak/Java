import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("น้ำหนัก (เซนติเมตร) = ");
	    double h = kb.nextDouble();
	    System.out.print("น้ำหนัก (กิโลกรัม) = ");
	    double w = kb.nextDouble();
	    
	    double mosteller = 0.0;
	    double dubois = 0.0;
	    double boyd = 0.0;
	    
	    mosteller = Math.sqrt((w * h) / 3600);
	    dubois = (71.84 * Math.pow(w, 0.425) * Math.pow(h, 0.725)) / 10000;
	    boyd = 0.0003207 * Math.pow(h, 0.3) * Math.pow(1000 * w, (0.7285 - 0.0188 * (3 + Math.log10(w))));
	    
	    System.out.println("Mosteller (ตารางเมตร) = " + mosteller);
	    System.out.println("Du Bois  (ตารางเมตร) = " + dubois);
	    System.out.println("Boyd  (ตารางเมตร) = " + boyd);
	}
}

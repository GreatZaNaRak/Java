import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("จำนวนวินาที = ");
		int sec = kb.nextInt();
		int y, m, d, h, min, s, dh;
	    
		dh = sec;
		y = dh / (60 * 60 * 24 * 30 * 12);
		dh -= y * 60 * 60 * 24 * 30 * 12;
		m = dh / (60 * 60 * 24 * 30);
		dh -= m * 60 * 60 * 24 * 30;
		d = dh / (60 * 60 * 24);
		dh -= d * 60 * 60 * 24;
		h = dh / (60 * 60);
		dh -= h * 60 * 60;
		min = dh /60;
		dh -= min * 60;
		s = dh;
		
		System.out.println(sec + " วินาที = " + y + " ปี " + m + " เดือน " +
                d + " วัน " + h + " ชั่วโมง " + min + " นาที " + s + " วินาที");
	}
}

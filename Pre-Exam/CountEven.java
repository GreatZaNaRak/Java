
public class CountEven {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 3, 6, 90, 21, 46 };
		int[] b = { 1, 3, 5, 7, 9 };
		int[] c = { 2, 4, 6, 8, 10, 12, 13 };
		System.out.println(countEven(a));
		System.out.println(countEven(b));
		System.out.println(countEven(c));
	}
	public static int countEven(int[] a) {
		int count = 0;
		for (int i : a) 
			if (i % 2 == 0 ) count++;
		return count;
	}
}

import java.util.*;

public class partialArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(partialArray(a,1,3)));
		
		
		
	}
	public static int[] partialArray(int[] a , int i , int j) {
		List<Integer> a1 = new ArrayList<>();
		if (a == null) return null;
		if (i < j && i <= a.length && j <= a.length) {
			for (int k = 0 ; k < a.length ; k++) {
				if ( i <= k && k < j) continue;
				a1.add(a[k]);
			}
			int[] out = a1.stream().mapToInt(o -> o).toArray();
			return out;
		}
		return null;
	}
}

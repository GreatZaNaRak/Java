import java.util.*;

public class partialArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(partialArray(a,1,3)));
		
		
		// ชอบมาก อยากได้!!
	}
	 public static int[] partialArray(int[] a,int i, int j) {
	        if (a == null) return null;
	        if (i < j && i <= a.length && j <= a.length) {
	            for (int k = 0 ; k < a.length ; k++) {
	                if (i <= k && k < j) a[k] = -999 ;
	            }
	            int count = 0;
	            for (int k : a)
	                if (k == -999) count++;
	            int[] out = new int[a.length-count];
	            int run = 0;
	            for (int k = 0 ; k < a.length ; k++) {
	                if (run >= out.length) break;
	                if (a[k] == -999) continue;
	                out[run++] = a[k];
	            }
	            return out;
	        }
	        return null;
	}
}

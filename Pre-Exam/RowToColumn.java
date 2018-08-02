import java.util.*;
import java.util.stream.Collectors;

public class RowToColumn {
	public static void main(String[] args) {
		
		
	}
	public static int[][] rowToColumn(int[][] a) {
		int[][] out = new int[a.length][a.length];
		for (int i = 0 ; i < a.length ; i++) {
			for (int j = 0 ; j < a.length ; j++) {
				out[i][j] = a[j][i];
			}
		}
		return out;
	}
}

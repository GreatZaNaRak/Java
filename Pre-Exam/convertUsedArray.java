import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Convert {
	public static void main(String[] args) throws FileNotFoundException  {
		String[] a = {"5","1","a","7","F"}; 
		String[] ans = convert(a);
		System.out.println(Arrays.toString(ans));
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		System.out.println(ans[2]);
		System.out.println(ans[3]);
		System.out.println(ans[4]);
		
	}
	public static String[] convert(String[] s) throws FileNotFoundException { 
		String[] get = new String[s.length];
		Scanner f = new Scanner(new File("src/mapping.txt"));
		int count = 0;
		while (f.hasNext()) {
			count++;
			f.next();
		}
		f.close();
		f = new Scanner(new File("src/mapping.txt"));
		String[][] data = new String[count][2];
		int j = 0;
		while (f.hasNext()) {
			String[] check = f.next().split(",");
			data[j][0] = check[0];
			data[j++][1] = check[1];
		}
		
		for (int k = 0 ; k < s.length ; k++) {
			boolean has = false;
			for (int i = 0 ; i < data.length ; i++) {
				if (s[k].equalsIgnoreCase(data[i][0])) {
					get[k] = data[i][1];
					has = true;
				}
				else if (s[k].equalsIgnoreCase(data[i][1])) {
					get[k] = data[i][0];
					has = true;
				}
			}
			if (!has) get[k] = "No match";
		}
		f.close();
		return get;
	}
}

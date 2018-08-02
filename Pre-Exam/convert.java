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
		Map <String,String> data = new HashMap<>();
		Map <String,String> data2 = new HashMap<>();
		Scanner f = new Scanner(new File("src/mapping.txt"));
		while (f.hasNext()) {
			String[] go = f.next().split(",");
			data.put(go[0], go[1]);
			data2.put(go[1], go[0]);
		}
		List<String> out = new ArrayList<>();
		for (String i : s) {
			if (data.containsKey(i)) out.add(data.get(i));
			else if (data2.containsKey(i)) out.add(data2.get(i));
			else out.add("No match");
		}
		String[] out1 = out.stream().map(i -> i).toArray(String[] :: new);
		return out1;
	}
}

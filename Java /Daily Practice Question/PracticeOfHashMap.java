package hashma;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PracticeOfHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> str = new HashMap<String,Integer>();
		str.put("h", 200);
		str.put("b", 100);
		str.put("f", 500);
		str.put("d", 400);
		
		Set<Map.Entry<String,Integer>> st = str.entrySet();  // return set view
		
		for(Map.Entry<String,Integer> me : st) {
			System.out.println(me.getKey() + ":" + me.getValue());
			System.out.println();
		}
		
		
		Map<String,Integer> str1 = new TreeMap<String,Integer>();
		str1.put("a", 200);
		str1.put("s", 100);
		str1.put("c", 500);
		str1.put("n", 400);
		
		Set<Map.Entry<String,Integer>> sto = str1.entrySet();  // return set view
		
		for(Map.Entry<String,Integer> me : sto) {
			System.out.println(me.getKey() + ":" + me.getValue());
			System.out.println();
		}

	}

}

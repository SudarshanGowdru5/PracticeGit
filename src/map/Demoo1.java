package map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Demoo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "hello", "hello", "hi", "hell", "hi" };
		TreeMap<String, Integer> l1 = new TreeMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!l1.containsKey(arr[i])) {
				l1.put(arr[i], 1);
			} else {
				int x = l1.put(arr[i], 1);
				x++;
				l1.put(arr[i], x);
			}
		}
		for (Entry<String, Integer> a : l1.entrySet()) {
			System.out.println(a.getKey() + " " + a.getValue());
		}
	}

}

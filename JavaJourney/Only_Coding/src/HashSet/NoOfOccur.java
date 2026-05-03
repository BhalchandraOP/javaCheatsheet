package HashSet;

import java.util.ArrayList;
import java.util.HashMap;

public class NoOfOccur {

	public static void main(String[] args) {

//		Using hashmap print the number of times element is repeating as value and the element as 
//		key(e.g. List of (12,12,12,14) | Done 

//	List<Integer> list =List.of(12,12,12,14);

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(12);
		arr.add(12);
		arr.add(12);
		arr.add(13);
		arr.add(6);
		arr.add(13);
//	Needed number,repeatvalue -> HashMap

		HashMap<Integer, Integer> arrHM = new HashMap<>();
		for (int a : arr) {

			arrHM.put(a, arrHM.getOrDefault(a, 0) + 1);

//				arrHM.put(a, 1);

		}
		System.out.println(arrHM);

	}

}

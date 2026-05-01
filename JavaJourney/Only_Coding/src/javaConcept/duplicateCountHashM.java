package javaConcept;

import java.util.HashMap;

// Q2. Find duplicate elements
// Input: [1,2,3,3,1,5]
// Output: [1,3]
public class duplicateCountHashM {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 1, 5 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int dup : arr) {
			if (map.containsKey(dup)) {
				map.put(dup, map.get(dup) + 1);
			} else {
				map.put(dup, 1);
			}
		}
//	for(int dup: arr) {
//		map.put(dup, map.getOrDefault(dup, 0)+1);
//	}
		for (int key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.print(key + " ");
			}
		}

	}

}

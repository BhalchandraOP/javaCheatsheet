package javaConcept;

import java.util.HashMap;

//Q1. Print frequency of elements
//Input: [1,1,2,3,3,3]
//Output: {1=2, 2=1, 3=3}

//check number is in map 
//if yes then increase count
//othrwse initialise it
public class hashmap {

	public static void main(String[] args) {

		int ar[] = { 1, 1, 2, 3, 3, 3 };

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int nw : ar) {
			if (map.containsKey(nw)) {
				map.put(nw, map.get(nw) + 1);
			} else {
				map.put(nw, 1);
			}
		}
		System.out.print(map);
	}
}

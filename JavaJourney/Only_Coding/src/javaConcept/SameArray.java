package javaConcept;

import java.util.HashMap;
//Q3. Check if two arrays are equal (order doesn't matter)

public class SameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> match = new HashMap<>();
		HashMap<Integer, Integer> match2 = new HashMap<>();
		int ar1[] = { 1, 2, 3, 4 };
		int ar2[] = { 1, 3, 2, 4 };
		if (ar1.length != ar2.length) {
			System.out.println("They are different! ");
		} else {
			for (int i : ar1) {
				match.put(i, match.getOrDefault(i, 0) + 1);
			}
			for (int i : ar2) {
				match2.put(i, match2.getOrDefault(i, 0) + 1);
			}
			System.out.print(match);
			System.out.println(match2);

			if (match.equals(match2)) {
				System.out.println("They are same !");
			} else {
				System.out.println("They are different! ");
			}
		}
	}

}

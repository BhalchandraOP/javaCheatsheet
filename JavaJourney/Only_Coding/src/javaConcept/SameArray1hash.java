package javaConcept;

import java.util.HashMap;

public class SameArray1hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> match = new HashMap<>();
		int ar1[] = { 1, 2, 3, 4 };
		int ar2[] = { 1, 3, 2, 4 };
		if (ar1.length != ar2.length) {
			System.out.print("They are different!");
			return;
		}
		// increment
		for (int dup : ar1) {
			match.put(dup, match.getOrDefault(dup, 0) + 1);
		}
		// decrement
		for (int dup : ar2) {
			if (!match.containsKey(dup)) {
				System.out.print("They are different!!");
				return;
			}
			match.put(dup, match.get(dup) - 1); // already checked for new key so abhi ddefault value ki jarurat nhi
			// clean comedy
			if (match.get(dup) == 0) {
				match.remove(dup);
			}
		}

		// Check for EmptyMap
		if (match.isEmpty()) {
			System.out.println("They are same!");
		} else {
			System.out.print("They are different!!!");
		}
	}
}

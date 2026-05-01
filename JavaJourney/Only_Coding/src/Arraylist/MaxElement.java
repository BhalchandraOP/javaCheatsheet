package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxElement {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 33, 4, 25);
		List<Integer> listal = new ArrayList<>(list);
		int Max = Integer.MIN_VALUE;
		if (listal.isEmpty()) {
			System.out.println("Empty list ");
		} else {
			for (int m : listal) {
				if (m > Max) {
					Max = m;
				}
			}
			System.out.println("Max Number: " + Max);
			// Collections
			int A = Collections.max(listal);
			System.out.print("MAx: " + A);

		}
	}

}

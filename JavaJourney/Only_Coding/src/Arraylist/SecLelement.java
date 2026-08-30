package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class SecLelement {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 5, 2, 9);
		List<Integer> listal = new ArrayList<>(list);
		int L = Integer.MIN_VALUE;
		int SL = Integer.MIN_VALUE;
		for (int num : listal) {
			if (num > L) {
				SL = L;
				L = num;
			} else if (num > SL && num != L) { // Important Case
				SL = num;
			}
		}
		if (SL == Integer.MIN_VALUE) {
			System.out.println("No second Element");
		} else {
			System.out.print("SEcond LArgest: " + SL);

		}
	}

}

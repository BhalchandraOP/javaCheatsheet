package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 4, 5, 2, 9, 6, 7, 8, 3, 3, 3, 4);
		List<Integer> listal = new ArrayList<>(list);
		for (int i = 0; i < listal.size(); i++) {
			for (int j = i + 1; j < listal.size(); j++) {
				if (listal.get(i).equals(listal.get(j))) {
					listal.remove(j);
					j--;
				}
			}
		}
		System.out.print(listal);
	}

}

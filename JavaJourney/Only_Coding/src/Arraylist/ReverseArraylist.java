package Arraylist;

import java.util.ArrayList;
import java.util.List;

//	Reverse ArrayList without extra space
public class ReverseArraylist {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 5, 2, 9, 6, 7, 8, 3, 3, 4);
		List<Integer> listal = new ArrayList<>(list);
		int left = 0;
		int right = listal.size() - 1;
		while (left < right) {
			int temp = listal.get(right);
			listal.set(right, listal.get(left));
			listal.set(left, temp);
			left++;
			right--;
		}
		System.out.print(listal);
	}

}

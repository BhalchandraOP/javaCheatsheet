package practice.codes;

import java.util.HashSet;

public class removesDuplicates {
	public static void remDub(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}
//		return set.size(); // Number of unique elements
		System.out.println(set); // Gives set of unique elements
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 4, 5, 5, 6 };
		remDub(arr);
//		 System.out.print(remDub(arr));
	}

}

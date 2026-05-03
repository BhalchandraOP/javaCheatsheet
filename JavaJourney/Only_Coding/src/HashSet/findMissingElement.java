package HashSet;

import java.util.HashSet;

//Find missing number in array (1 to n)
public class findMissingElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7 };
//max
		int a = arr[0];
		for (int m : arr) {
			if (a < m) {
				a = m;
			}
		}
		// added given array to hash
		HashSet<Integer> uni = new HashSet<>();
		for (int n : arr) {
			uni.add(n);
		}
		for (int i = 1; i <= a; i++) {
			if (!uni.contains(i)) {
				System.out.println("Missing element: " + i);
			}
		}

	}
}

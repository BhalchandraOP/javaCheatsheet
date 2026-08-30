package HashSet;

import java.util.HashSet;
import java.util.Set;

//Find missing number in array (1 to n)

// first n nums , got the maxm ele from array 
// loaded array into hashset
// init for loop till Max , used contains for each i and got the missing ele
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
		Set<Integer> uni = new HashSet<>();
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

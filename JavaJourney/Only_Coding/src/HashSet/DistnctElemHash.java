package HashSet;

import java.util.HashSet;

//Count distinct elements in array
//Example:
//[1,2,2,3,4,4,5] → Output: 5
public class DistnctElemHash {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 3, 4, 4, 5, 6, 6 };
		HashSet<Integer> uni = new HashSet<>();

		for (int n : arr1) {
			uni.add(n);
		}
		System.out.print("Distinct element: " + uni.size());
	}

}

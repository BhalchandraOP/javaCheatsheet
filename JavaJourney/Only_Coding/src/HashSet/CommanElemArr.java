package HashSet;

import java.util.HashSet;

//Find common elements between two arrays using HashSet
//Example:
//[1,2,3,4] and [3,4,5,6] → Output: [3,4]
//Since hset takes only unique ,add first arr , and just check elem with that hset 
public class CommanElemArr {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 3, 4, 4 };
		HashSet<Integer> uni = new HashSet<>();
		for (int n : arr1) {
			uni.add(n);
		}
		for (int n : arr2) {
			if (uni.contains(n)) {
				System.out.println(n);
				uni.remove(n); // W logic removed element phle dup milne ke baad, avoiding
				// reprint for next duplication of same element
			}
		}
	}

}

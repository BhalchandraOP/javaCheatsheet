package HashSet;

import java.util.HashSet;

//Q5:
//Find union of two arrays using HashSet
//Example:
//[1,2,3] and [3,4,5] → Output: [1,2,3,4,5]
public class union2arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 3, 4, 5 };
		HashSet<Integer> uni = new HashSet<>();
		for (int n : arr1) {
			uni.add(n);
		}
		for (int n : arr2) {
			uni.add(n);
		}
		System.out.print(uni);
	}

}

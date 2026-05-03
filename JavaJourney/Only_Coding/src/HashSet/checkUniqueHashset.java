package HashSet;

import java.util.HashSet;

//Count number of unique elements in array using HashSet
//Example:
//[1,2,2,3,1,4] → Output: 4
public class checkUniqueHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 2, 3, 1, 4 };

		HashSet<Integer> uni = new HashSet<>();
		for (int n : arr) {
			uni.add(n);
		}
		// Since HashSet doesnt allow Duplicate so no of unique ele = Size
		System.out.println("Unique: " + uni.size());
	}

}

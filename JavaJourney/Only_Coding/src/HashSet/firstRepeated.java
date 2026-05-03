package HashSet;

import java.util.HashSet;

//Find first repeated element in array
//Example:
//[1,2,3,2,4,5] → Output: 2
public class firstRepeated {

	public static void main(String[] args) {
		boolean found = false;
		int[] arr = { 5, 2, 3, 2, 5 };
		HashSet<Integer> uni = new HashSet<>();
		for (int a : arr) {
			if (uni.contains(a)) {
				System.out.println("first repeated value: " + a);
				found = true;
				break;
			}
			uni.add(a);
		}
		if (!found) {
			System.out.print("No Duplicate Found! ");
		}
	}

}

package HashSet;

import java.util.HashSet;

// Longest consecutive sequence in array
//Input:  [100, 4, 200, 1, 3, 2]
//Output: 4
//HashSet
//loop
//while
public class LongestConsecSequence {

	public static void main(String[] args) {
		int[] arr = { 100, 4, 200, 1, 3, 2 };
		// Hashset, loaded value in set
		HashSet<Integer> uni = new HashSet<>();
		for (int n : arr) {
			uni.add(n);
		}

		int longest = 0;
		int current;
		int count = 0;
		// sequence check with starting from first element of that seq
		for (int n : arr) {
			if (!uni.contains(n - 1)) {
				current = n;
				count = 1;
				while (uni.contains(current + 1)) {
					current++;
					count++;
				}
			}
			// now ,sequence may contain multiple small seq,we want the longest one!
			longest = Math.max(longest, count);
		}
		System.out.println("Longest consecutive sequence: " + longest);
	}

}

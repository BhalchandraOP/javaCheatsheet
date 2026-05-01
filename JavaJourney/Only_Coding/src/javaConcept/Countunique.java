package javaConcept;
//Print elements that appear exactly once

//Example:
//Input: [1,1,2,3,3,4]
//Output: 2, 4

public class Countunique {

	public static void main(String[] args) {

		int ar[] = { 1, 1, 2, 3, 3, 4 };
		for (int i = 0; i < ar.length; i++) {
			int count = 0;
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(ar[i] + " ");
			}
		}
	}

}

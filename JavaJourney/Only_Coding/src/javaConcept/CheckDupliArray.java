package javaConcept;

//Given an array, check if it contains duplicates
public class CheckDupliArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		boolean f = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					f = true;
					break;
				}
			}
		}
		if (f) {
			System.out.print("Yes,It contain duplicates");
		} else {
			System.out.print("All Unique!");
		}

	}

}

package practice.codes;

public class maximumElement {
	public static int maximumElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		maximumElement(arr);
		System.out.print("Max element: " + maximumElement(arr));
	}

}

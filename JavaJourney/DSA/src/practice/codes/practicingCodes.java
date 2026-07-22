package practice.codes;

public class practicingCodes {

//	######################
//	Write programs for:
//
	public static void all(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

//		Find maximum element
	public static void max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max element: " + max);
	}

//		Find minimum element
	public static void min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Min element: " + min);
	}

//		Calculate sum of array
//	Calculate average

	public static void sum(int[] arr) {
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);

	}

//		Count even numbers
	public static void even(int[] arr) {
		System.out.println("Even numbers: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();

	}
//		Count odd numbers

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		all(arr);
		max(arr);
		min(arr);
		sum(arr);
		even(arr);

	}

}

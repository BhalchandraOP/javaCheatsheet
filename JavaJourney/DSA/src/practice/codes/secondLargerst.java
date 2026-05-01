package practice.codes;

public class secondLargerst {

	public static int seclarg(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > largest) {
				second = largest;
				largest = num;
			} else if (num > second && num != largest) {
				second = num;
			}
		}

		return second;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 0 };
		seclarg(arr);
		System.out.print("second largest element- " + seclarg(arr));
	}

}

package practice.codes;

public class reverseArray {

	public static void reverse(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		System.out.println("reversed array :>");
		reverse(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}

package HashSet;

public class singleMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 6, 7 };
		// max
		int a = arr[0];
		for (int m : arr) {
			if (a < m) {
				a = m;
			}
		}
		// comparing sum first n elem
		int expectedsum = (a * (a + 1)) / 2;
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		if (sum != expectedsum) {
			System.out.println("Missing element: " + (expectedsum - sum));
		} else {
			System.out.print("No missing element");
		}

	}

}

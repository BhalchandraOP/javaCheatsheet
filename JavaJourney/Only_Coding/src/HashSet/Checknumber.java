package HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Checknumber {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 33, 4, 25);
		Set<Integer> hset = new HashSet<>(list);

		Scanner scanner = new Scanner(System.in); // Created scanner object
		System.out.println("Check whether it exist or not ");
		int check = scanner.nextInt();
		scanner.close();

		// System.out.print(hset);
		if (hset.contains(check)) {
			System.out.println(check + ": true");
		} else {
			System.out.println(check + ": false");
		}
//		List<Integer> uniqueList = new ArrayList<>(new HashSet<>(list));

	}

}

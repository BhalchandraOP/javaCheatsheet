package functionalProgramming;

import java.util.List;

public class FPNumberRunner1 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		System.out.println(numbers);
		printFPSum(numbers);
	}

	static void printFPSum(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, (num1, num2) -> {
			System.out.println(num1 + " " + num2);
			return num1 + num2;
		});
		System.out.println("Even Numbers Sum: " + sum);

		// TODO Auto-generated method stub

	}

}

package functionalProgramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1, 2, 3, 4, 56, 7, 3);
		numbers.stream().forEach(element -> System.out.println(element));
//		int sum = numbersum(numbers);

		int sum = fpSum(numbers);

// in this step we reduces the the number of 
//terms by adding adjscent terms starting with 0
		System.out.println(sum);
	}

	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().filter(number -> number % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
	}

	private static int numbersum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
// in functional pro , mutation avoided
// fp focuses on telling what rather telling how to do it.
// stream() is source of any data anything.stream() will avail our to the data and 
}

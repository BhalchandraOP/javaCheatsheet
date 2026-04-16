package javajourney.loops;

public class myNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(5);

		boolean isPrime = number.isPrime(); // This is for Checking is it number Prime or not

		System.out.println("isPrime " + isPrime);
		// Now, Lets Code for sum of first n number !!

		int sum = number.sumofN(); // Input wahi rahega , Just Applying various operation to it.

		System.out.println("Sum of N  " + sum);

		int SoD = number.sumOfDiv();
		System.out.println("Sum of Divisors  " + SoD);

		number.printNumbertringle();

	}

}

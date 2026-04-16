package javajourney.loops;

import java.util.Scanner;

public class DowhileReapeterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ask use for a number ?
		Scanner scanner = new Scanner(System.in);

		int number = -1;
		do {
			if (number != -1) {
				System.out.println("Cube is " + (number * number * number));
			}
			System.out.println("Enter a number :");
			number = scanner.nextInt();
		} while (number >= 0);
		System.out.println("Thank You !");
	}

}

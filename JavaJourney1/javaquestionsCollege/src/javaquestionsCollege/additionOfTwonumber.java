package javaquestionsCollege;

import java.util.Scanner;

public class additionOfTwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first Number: ");
		int num1 = scanner.nextInt();

		System.out.println("Enter the Second Number: ");
		int num2 = scanner.nextInt();

		int sum = num1 + num2;

		System.out.println("The sum of " + num1 + " and " + num2 + " is : " + sum);

	}

}

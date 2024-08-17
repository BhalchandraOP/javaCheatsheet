package javajourney.conditionals;

import java.util.Scanner; // kyuki ye in built functionality hai toh 
							// ise use karne ke liye import kiya

public class MenuRunner {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Number1: ");
			int number1 = scanner.nextInt();
			System.out.println("The number you entered is - " + number1);

			System.out.println("Enter Number2: ");
			int number2 = scanner.nextInt();
			System.out.println("The number you entered is - " + number2);

			System.out.println("Choices Available are ");
			System.out.println("1 - Add ");
			System.out.println("2 - Subtract ");
			System.out.println("3 - Multiply");
			System.out.println("4 - Divide ");

			System.out.println("Enter Choices->");
			int choice = scanner.nextInt();

			System.out.println("Your Choices Are->");
			System.out.println("Number1- " + number1);
			System.out.println("Number2- " + number2);
			System.out.println("Choice- " + choice);

			performOperation(number1, number2, choice);
		}
	}

	private static void performOperation(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("Result--> " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result--> " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result--> " + (number1 * number2));
			break;
		case 4:
			System.out.println("Result--> " + (number1 / number2));
			break;
		default:
			System.out.println("Invalid Choices!!");
			break;
		}

	}

}

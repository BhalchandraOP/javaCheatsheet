package javajourney.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;

	}

	public boolean isPrime() {
		// TODO Auto-generated method stub
		if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public int sumofN() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfDiv() {
		int SoD = 0;
		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				SoD += j;
			}
		}

		// TODO Auto-generated method stub
		return SoD;
	}

	public void printNumbertringle() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

	}

}

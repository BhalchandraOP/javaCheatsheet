package com.bhalchandra.execptions;

public class ArithmeticException {

	public static void main(String[] args) {
		System.out.println("Bhala");

		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("Aaya Aaya exception");
		}

		int[] arr = { 1, 2, 3, 4 };

		try {
			System.out.println(arr[6]);
		} catch (Exception e) {
			System.out.println("Ye aaya dusra");
		}

	}
}

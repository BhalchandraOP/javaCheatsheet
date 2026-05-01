package Arraylist;

import java.util.ArrayList;

//Count even numbers in ArrayList
//Example:
//[10, 15, 20, 25, 30] → Output: 3
public class countOddEven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		int count = 0;
		for (int i : list) {
			if (i % 2 == 1) { // i%2=0 for even
				count++;
			}
		}
		System.out.println(count);

	}
}

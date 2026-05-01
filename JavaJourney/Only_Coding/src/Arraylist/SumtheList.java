package Arraylist;

import java.util.ArrayList;

public class SumtheList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);

		// enhance for loop
		int su = 0;

		for (int m : list) {
			su += m;
		}
		System.out.print(su);

	}

}

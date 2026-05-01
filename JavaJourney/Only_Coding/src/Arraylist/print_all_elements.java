package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

//Q1: Print all elements(traversing)
public class print_all_elements {

	public static void main(String[] args) {
		ArrayList<Integer> map = new ArrayList<>();
		map.add(10);
		map.add(20);
		map.add(30);
		map.add(40);
//	Enhance For Loop
		for (int m : map) {
			System.out.println(m);
		}
// For loop
		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}
//Iterator
		Iterator<Integer> it = map.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

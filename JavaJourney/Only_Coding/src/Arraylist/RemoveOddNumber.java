package Arraylist;

//Remove all odd numbers from ArrayList safely
import java.util.ArrayList;
import java.util.List;

public class RemoveOddNumber {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 5, 2, 9);
		List<Integer> listal = new ArrayList<>(list);
//Reverse transveral
		for (int i = listal.size() - 1; i >= 0; i--) {
			if (listal.get(i) % 2 == 1) {
				listal.remove(i);
			}
		}
		System.out.print(listal);
//		Iterator BEST WAY

//		Iterator<Integer> it = listal.iterator();
//		while(it.hasNext()) {
//			int num=it.next();
//			if(num%2==1) {
//				it.remove();
//			}
//		}
//		System.out.print(listal);
	}

}

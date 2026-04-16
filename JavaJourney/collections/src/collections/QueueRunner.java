package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value1.length(), value2.length());
		// If we want to reverse the order ,just flip the position of above )
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}

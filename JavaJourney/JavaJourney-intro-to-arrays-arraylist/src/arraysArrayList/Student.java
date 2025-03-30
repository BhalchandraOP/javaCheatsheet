package arraysArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;

	private ArrayList<Integer> marks = new ArrayList<Integer>();
	// Ab arr-> ArrayList me convert kiya toh Input method me bhi modification karna
	// pdega!

	public Student(String name, int... marks) {

		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfmarks() {
		// TODO Auto-generated method stub
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		int sum = getTotalSumOfMarks();
		int totalNum = getNumberOfmarks();

		return new BigDecimal(sum).divide(new BigDecimal(totalNum), 3, RoundingMode.UP);
		// Here answer can be come as 54.6666... so in this case We have to round off
		// our result to avoid errors.
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
}

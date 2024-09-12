package arraysArrayList;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Bhala", new int[] { 99, 64, 100 });
		// Here Class student has created ! in this class 'Bhala' where marks has we can
		// store
		// marks of that student and operate operations.

		int number = student.getNumberOfmarks();
		System.out.println("number of marks :" + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Sun of number:" + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum among them :" + maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum among them :" + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("average : " + average);

		System.out.println(student);

		student.addNewMark(35);

		System.out.println(student);

		student.removeMarkAtIndex(1);

		System.out.println(student);

	}

}

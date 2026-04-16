package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DesOrder implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}

}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Bhala"), new Student(3, "Adam"), new Student1(2, "Eve"));
		ArrayList<Student> studentAl = new ArrayList<>(students);
		System.out.println(students);

		Collections.sort(studentAl);
		System.out.println(studentAl);

		Collections.sort(studentAl, new DesOrder());

	}

}

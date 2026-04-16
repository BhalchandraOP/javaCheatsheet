package collections;

public class Student1 implements Comparable<Student1> {
	private int id;
	private String name;

	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student1 that) {
		return Integer.compare(this.id, that.id); // Sorting based on id
	}

	// Overriding toString to print meaningful output
	@Override
	public String toString() {
		return String.format("Student{%d,'%s'}", id, name);
	}
}

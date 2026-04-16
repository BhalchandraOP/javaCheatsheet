package javajourney_oops;

public class StudentRunner {

	public static void main(String[] args) {
		// Create Employee object
		Employee employee = new Employee("Bhala");
		employee.setEmail("oops@gmail.com");
		employee.setPhoneNum("987-654-3210");
		employee.setEmployeeGrade('A');
		employee.setTitle("Software Engineer");

		// Print Employee details
		System.out.println(employee);
	}
}

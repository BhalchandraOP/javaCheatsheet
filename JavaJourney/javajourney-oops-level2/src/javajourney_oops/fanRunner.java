package javajourney_oops;

public class fanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("Manufacturer 1 ", 0.3456, "Red");

		fan.switchOn();
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);

	}

}

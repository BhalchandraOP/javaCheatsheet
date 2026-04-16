package javajourney_oops;

public class Fan {
	// state
	private String make;
	private double radius;
	private String colour;

	private boolean isOn;
	private byte speed; // speed will be around 0 to 5.

	// creation of fan object
	// Basics of fan - ye toh hona hi chahiye !
	public Fan(String make, double radius, String colour) {
		this.make = make;
		this.radius = radius;
		this.colour = colour;
	}

//	public void isOn(boolean isOn) {
//		this.isOn = isOn;  
//	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 50); // hamsesha getter and setter ke alwa bhi chize hai bhai1

	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0); // Badhiya trik
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// print the state
	@Override
	public String toString() {
		return String.format("make - %s, radius - %f, colour - %s, isOn - %b, speed - %d", make, radius, colour, isOn,
				speed);
	}
}

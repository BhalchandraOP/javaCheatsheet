package introduction_ObjectOrientedProgramming;

public class MotorBike {
	private int speed;

	MotorBike(int speed) { // Constructor.
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void incSpeed(int how) { // Operations on input
		setSpeed(this.speed += how);

	}

	public void decSpeed(int how) { // Decrease karne par - bhi ho skta hai toh lets add condition to it
		setSpeed(this.speed -= how);

	}

	void start() {
		System.out.println("Bike Started !!");
	}
}

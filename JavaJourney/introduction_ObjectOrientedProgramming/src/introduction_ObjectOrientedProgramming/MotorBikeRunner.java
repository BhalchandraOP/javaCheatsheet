package introduction_ObjectOrientedProgramming;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike Honda = new MotorBike(200);

// state of objects

		ducati.start();
		Honda.start();

//		ducati.setSpeed(100);

		ducati.incSpeed(100);
		ducati.decSpeed(250);
		System.out.println(ducati.getSpeed());

		Honda.setSpeed(80);
		System.out.println(Honda.getSpeed());
	}

}

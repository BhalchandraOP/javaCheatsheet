package javajourney_oops;

interface flyable {

	void fly();
}

class Bird implements flyable {
	@Override
	public void fly() {
		System.out.println("with Wingss!");
	}
}

class Aeroplane implements flyable {
	@Override
	public void fly() {
		System.out.println("With fuels!");
	}
}

public class FlyableRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flyable[] objects = { new Bird(), new Aeroplane() };
		for (flyable m : objects) {
			m.fly();
		}
	}

}

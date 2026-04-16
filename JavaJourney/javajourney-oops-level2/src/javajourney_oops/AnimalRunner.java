package javajourney_oops;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("BOW BOW");
	}
}

class Cat extends Animal {
	@Override
	public void bark() {
		System.out.println("MEOW MEOW");
	}
}

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = { new Cat(), new Dog() };
		for (Animal m : animals) {
			m.bark();
		}
	}

}

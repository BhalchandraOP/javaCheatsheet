package com.bhalchandra.demo;

public class Alien {
	
	private int age;
	// another object
	private Computer com;
		
	// Constructor
	public Alien(int age) {
		this.age = age;
	}
	
	public Alien() {
		System.out.println("Alien Object Created!");
	}
	
	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void code() {
//		System.out.println("-->");
		System.out.println("I'm tripping");
		com.compile();
	}
}

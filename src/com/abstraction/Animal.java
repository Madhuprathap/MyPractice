package com.abstraction;

public abstract class Animal {
	//Abstraction
	public abstract void noOfLengs();
	
	public Animal(int a) {
	}
	
	//encapsulation
	private void isAlive() {
		System.out.println("this animal is alive");
	}
}

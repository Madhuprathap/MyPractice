package com.abstraction;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal = new Dog(1);//compile time error if Dog is abstract class
		animal.noOfLengs();
//		animal.bark(); //Upcast, can only call methods from base abstract calls methods
	}

}

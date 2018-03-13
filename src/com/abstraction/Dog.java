package com.abstraction;

public class Dog extends Animal{

	public Dog(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void noOfLengs() {
		System.out.println(Dog.class.getName() + " has 4 legs");
		
	}
	
	public static void main(String[] args) {
		System.out.println("Main can be called as it is satic method and dont need to instantiate");
	}
	
	private void bark() {
		System.out.println(Dog.class.getName() + " barks");
	}

}

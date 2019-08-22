package com.runtimepolymorphism;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Derived extends Base{

	public Derived() {
		super();
		System.out.println("Dervied constructor");
	}
	
	@Override
	public void update(User user) throws IOException, FileNotFoundException, NullPointerException{
		user.email = "test@test.com";
		System.out.println("derived update");
//		super.update(user);
//		throw new Exception();
	}

	public void direvedOnlyMethod() {
		System.out.println("direvedOnlyMethod");
	}
	
	@Override
	public void display(Object x) {
		// TODO Auto-generated method stub
		super.display(x);
	}
	
	// access scope should be broader -> can not decrease scope
	// return type should be same or sub-type
	// exception , can throw any no of new runtime/unchecked exceptions & can not throw any new checked exceptions other than sub-type of existing one. 
	// Can throw fewer checked exceptions too (can ignore checked exceptions declared in base method signature)
	@Override
	public void exceptionCheck() throws FileNotFoundException, NumberFormatException {
		// TODO Auto-generated method stub
	}
}

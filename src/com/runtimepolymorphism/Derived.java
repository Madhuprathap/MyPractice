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
}

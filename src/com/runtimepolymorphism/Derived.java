package com.runtimepolymorphism;

import java.io.IOException;

public class Derived extends Base{

	public Derived() {
		super();
		System.out.println("Dervied constructor");
	}
	
	
	public void update(User user) throws IOException, NullPointerException{
		user.email = "test@test.com";
		System.out.println("derived update");
		super.update(user);
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

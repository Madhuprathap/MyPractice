package com.runtimepolymorphism;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Base {
	
	public Base() {
		super();
		System.out.println("Base constructor");
		User user = new User();
		user.name = "Madhu";
		try {
			update(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(User user) throws Exception {
		System.out.println("base update" + user.name);
		System.out.println("base update" + user.email);
	}
	
	protected void display(Object x) {
		System.out.println("Base" + x);
	}

	public void exceptionCheck() throws IOException, ClassNotFoundException{
		System.out.println("Base exceptionCheck");
	}
}

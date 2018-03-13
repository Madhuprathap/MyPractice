package com.runtimepolymorphism;

import java.io.IOException;

public class Base {
	
	public Base() {
		super();
		System.out.println("Base constructor");
		User user = new User();
		user.name = "Madhu";
		try {
			update(user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(User user) throws IOException {
		System.out.println("base update" + user.name);
		System.out.println("base update" + user.email);
	}
	
	protected void display(Object x) {
		System.out.println("Base" + x);
	}

	
}

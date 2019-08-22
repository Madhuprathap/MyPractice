package com.inheritance;

import java.util.Collections;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		System.out.println(BajajBike.x);
		System.out.println("------madhu------");
		Bike bike = new BajajBike();
		BajajBike bike1 = new BajajBike();
		BajajBike bike2 = new BajajBike();
		System.out.println("i value: " + bike1.i); // variables are not polymorphic
		//		bike.staticTest(); // method hiding, static so reference class method & not polymorphic
		//		bike.newMethod(); // compile time error
		//		Bike b = new Bike();
		//Static binding
		System.out.println(bike.noOfWheels());
		System.out.println(((BajajBike)bike).getMileage());

		bike1.m(new String());

//		System.out.println(bike1.getName());

		String a =new String("madhu");
		String b = new String("prath");
		String c = new String();
		System.out.println(c = a+b);
		TreeMap<String, String> tm = new TreeMap<String, String>(Collections.reverseOrder());
	}
}

package com.inheritance;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class Test {
	public static void main(String[] args) {
//		Bike bike = new BajajBike();
		BajajBike bike1 = new BajajBike();
		BajajBike bike2 = new BajajBike();
//		Bike b = new Bike();
		//Static binding
		//System.out.println(bike.noOfWheels());
		//System.out.println(bike.getMileage());
		
		bike1.m(new String());
		
		System.out.println(bike1.getName());
		
		String a =new String("madhu");
		String b = new String("prath");
		String c = new String();
		System.out.println(c = a+b);
		TreeMap<String, String> tm = new TreeMap<String, String>(Collections.reverseOrder());
	}
}

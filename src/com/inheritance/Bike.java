package com.inheritance;

public class Bike {
	public Bike() {
		System.out.println("In Bike");
		method1();
	}
	
	public void method1() {
		System.out.println("In Bike - method1 ");
		
	}
	
	public String getName() {
		return "Bike";
	}
	
	public final int noOfWheels() {
		return 2;
	}
	
	public void m(String x){
		System.out.println("in BIke");
	}
	
	public void overridetest() {
		System.out.println("overridetest - Bike");
	}
}

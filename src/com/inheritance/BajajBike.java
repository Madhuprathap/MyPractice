package com.inheritance;

public class BajajBike extends Bike{
	public String getName() throws RuntimeException {
		try{
			//throw new NullPointerException();
			throw new IllegalArgumentException();
		} catch (Exception e) {
			System.out.println("exction");
			//return "from exception";
			throw new RuntimeException();
		} finally {
			System.out.println("finally");
		}
	}
	
	/*public int noOfWheels() {
		return 0;
	}*/
	
	public int getMileage() {
		return 45;
	}
	{
		System.out.println("In BBike initializer");
	}
	public BajajBike() {
		System.out.println("In BajajBike -----------");
		//method1();
	}
	
	@Override
	public void method1() {
		System.out.println("In BBike - method1");
	}
	
	public void m(Object x) {
		System.out.println("In b bike");
	}
	
}

package com.inheritance;

public class BajajBike extends Bike{
	// only once for the first time the class initialized
	static int x = 10;
	static {
		System.out.println("Static Bajaj Bike");
	}
	static int i = 10;
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
	// before constructor blocks get executed
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
	// it is not overriding but is overloading
	public void m(Object x) {
		System.out.println("In b bike");
	}
	
	public static void staticTest() {
		System.out.println("staticTest - BajajBike");
	}
	
	public void newMethod() {
		System.out.println("staticTest - BajajBike");
	}
	
}

package com.threading;

// when we don't have make explicit constructor call to parent class compiler will call default constructor with out arguments.
// If your parent class have argumented constructor then we have to make explicit super constructor call 
// otherwise compile time error as compiler tries to add default constructor call and it leads to compile time error as there is not default constructor in parent class.
public class AbstractionTest {
	public static void main(String[] args) {
		Thread t = new Thread(new Mythread() {
			@Override
			public void run() {
				System.out.println("main run");
			}
		});
		
		t.start();
	}
}

class Mythread implements Runnable {
	public Mythread() {
		System.out.println("my thread constuctor");
	}

	@Override
	public void run() {
		System.out.println("my thread run");
	}
	
	public void start() {
		System.out.println("my thread start");
	}
	
}

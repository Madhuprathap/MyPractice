package com.innerclasses;

public class Test {
	//Inner class can access all outer class members and methods even private
	class InnerClass {
		/*public InnerClass() {
			print1();
		}*/
		public void print() {
			testPrint();
			System.out.println("InnerClass - Print");
		}
		public void print1() {
			System.out.println("InnerClass - Print1");
		}
	}
	
	private void testPrint() {
		//print1(); //Outer class cann't access innerclass methods, they can accessed via object
		//new InnerClass().print1();
		System.out.println("MainClass - Print");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Test().testPrint();
		new Test().new InnerClass().print();
		
	}

}

package com.overload;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.print(new Integer(1));
		t.print(1);
		t.print("adf");
		t.print(new String());
		t.print(new Object());
//		t.print(null); // Ambiguity - compile time error
	}
	
	private void print(Object o) {
		System.out.println("Object");
	}
	
	private void print(String o) {
		System.out.println("String");
	}
	
	private void print(Integer o) {
		System.out.println("Integer");
	}
}

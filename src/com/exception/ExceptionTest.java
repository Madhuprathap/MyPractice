package com.exception;

public class ExceptionTest {
public static void main(String[] args) {
	try {
		m1();
	} catch(RuntimeException e1) {
		System.out.println("RT");
	} catch(Exception e2) {
		System.out.println("E");
	} 
}

private static void m1() throws RuntimeException, Exception {
	try {
		m2();
	} finally {
		m3();
	}
}

private static void m3() throws Exception {
	throw new Exception();
}

private static void m2() throws RuntimeException {
	throw new RuntimeException();
}
}

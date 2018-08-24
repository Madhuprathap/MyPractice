package com.exception;

public class ThorwsException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			divide();
		} catch (Exception e) {
			System.out.println("In Catch");
		} finally {
			System.out.println("In Finally");
		}
		
	}

	private static void divide() throws Exception {
		try {
			throw new Exception();
		} finally {
			System.out.println("In Finally");
		}
		
	}
	
	

}

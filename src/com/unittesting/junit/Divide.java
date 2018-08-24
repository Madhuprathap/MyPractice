package com.unittesting.junit;

public class Divide {

	public int divide(int i, int j) throws Exception {
		int k = i/j;
		return k;
		
	}
	
	 @SuppressWarnings("null")
	public static void main(String[] args) {
		Divide divide = null;
		
		try {
			System.out.println(divide.divide(1, 2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

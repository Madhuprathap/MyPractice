package com.exception;

import java.sql.SQLException;

public class Test {
	public static void main(String[] args) {
//		try{
//			System.out.println(getInt());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			System.out.println(1);
			if (true) {
				throw new SQLException();
			}
			System.out.println(2);
		} catch (Exception e) {
			System.err.println("In catch");
			e.printStackTrace();
			return;
		} finally {
			try{
				throw new NullPointerException();
			} catch (Exception e) {
				System.out.println("in finally catch");
			}
		}
		
		System.out.println(3);
		
	}

	private static int getInt() throws NumberFormatException{
		throw new NumberFormatException();
	}
}

package com.geeksforgeeks;

import java.util.Arrays;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder text = new StringBuilder("abcdefghij");
		reverseString(text);
		System.out.println(text);
		
	}


	private static void reverseString(StringBuilder text) {
		for (int i = 0, j = text.length()-1; i < j; i++,j--) {
			char temp = text.charAt(j);
			text.setCharAt(j, text.charAt(i));
			text.setCharAt(i, temp);
		}
		System.out.println(text);
	}

}

package com.geeksforgeeks;

public class PermutationOfString {
	
	private static PermutationOfString ofString = new PermutationOfString();
	
	static PermutationOfString permutationOfString = null;
	
	//Method/block local variables can not be static and have access specifier
	//In static block only static class variables are allowed
	static {
		permutationOfString = new PermutationOfString();
		System.out.println(permutationOfString);
		String str = new String("Madhu");
	}
	
	public static void main(String[] args) {
		StringBuilder text = new StringBuilder("ABCD");
		System.out.println(permutationOfString);
		permutationsOfString(text, 0);
	}

	private static void permutationsOfString(StringBuilder text, int start) {
		if (start == text.length() -1) {
			System.out.println(text);
		} else {
			for (int i = start ; i < text.length(); i++) {
				char temp = text.charAt(start);
				text.setCharAt(start, text.charAt(i));
				text.setCharAt(i, temp);
				permutationsOfString(text, start+1);
				temp = text.charAt(start);
				text.setCharAt(start, text.charAt(i));
				text.setCharAt(i, temp);
				
			}
		}
		
	}
}

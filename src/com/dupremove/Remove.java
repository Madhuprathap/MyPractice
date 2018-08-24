package com.dupremove;

import java.util.HashSet;
import java.util.Set;


public class Remove {
static String input = "MadhuMadprathap";
	public static void main(String[] args) {
		String arr[] = new String[10];
		int intarr[] = new int[]{};
		
		Set uniqueChars = new HashSet();
		StringBuilder output = new StringBuilder();
		
		try {
			for (int i = 0; i < input.length(); i++) {
				if (uniqueChars.add(input.charAt(i))) {
					output.append(input.charAt(i));
				}
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(output);
	}
}

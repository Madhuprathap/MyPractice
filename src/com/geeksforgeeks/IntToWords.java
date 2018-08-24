package com.geeksforgeeks;

import java.util.Scanner;

public class IntToWords {

	static int l ;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to convert into words (in tens place limited to 30):");
		String text = scanner.next();
		
		String[] words = new String[] {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty-one","twenty-two","twenty-three","twenty-four","twenty-five","twenty-six","twenty-seven","twenty-eight","twenty-nine","thirty"};
		int length = text.length();
		l = length;
		int m = Integer.parseInt(text);
		parseNumberTowords(words, m, length);
	}

	private static void parseNumberTowords(String[] words, int m, int length) {
		if (length >= 0) {
			int reminder;
			int dividend;
			if (length == l-2) {
				reminder = m % 10;
				dividend = m/10;
				parseNumberTowords(words, dividend, length-1);
			} else {
				reminder = m % 100;
				dividend = m/100;
				parseNumberTowords(words, dividend, length-2);
			}
			
			System.out.print(words[reminder]);
			int caseValue = l - length;
			switch (caseValue) {
			case 2:
				System.out.print(" Hunderds ");
				break;
				
			case 3:
				System.out.print(" Thousands ");
				break;

			case 5:
				System.out.print(" Lakhs ");
				break;
			case 6:
				System.out.print(" crore ");
				break;
			}
			
		}
		
	}

}

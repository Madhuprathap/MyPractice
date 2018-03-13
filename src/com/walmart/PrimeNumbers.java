package com.walmart;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrimeNumbers {
	
	static boolean[] prime = null;
	static Map<Integer, Integer> digitsOccurance = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting and ending range:");
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		//initialize prime array with true
		prime = new boolean[end+1];
		for (int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}
		
		primeNumberCal(start, end);
		if (start < 2) {
			start = 2;
		}
		//printing prime numbers from starting to end
		digitsOccurance = new HashMap<Integer, Integer>();
		for (int i = start; i <= end; i++) {
			if (prime[i] == true) {
				System.out.println(i);
				Countdigits(i);
			}
		}
		
		System.out.println(digitsOccurance);
	}

	private static void Countdigits(int i) {
		while (true) {
			if (i > 0) {
				int reminder = i%10;
				i = i/10;
				Integer value= digitsOccurance.get(reminder);
				if (value != null) {
					value = value + 1;
					digitsOccurance.put(reminder, value);
				} else {
					digitsOccurance.put(reminder, 1);
				}
			} else {
				break;
			}
		}
	}

	private static void primeNumberCal(int start, int end) {
		for (int i = 2; i*i < end; i++) {
			if (prime[i] == true) {
				for (int j = i*i; j < prime.length; j = j+i) {
					prime[j] = false;
				}
			}
		}
	}

}

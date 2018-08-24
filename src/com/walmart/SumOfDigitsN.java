package com.walmart;

import java.util.Scanner;

public class SumOfDigitsN {
	static int[][] dpArray = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of digits to sum:");
		int digitsCount = scanner.nextInt();
		System.out.println("Enter sum to calculate:");
		int total = scanner.nextInt();
		
		dpArray = new int[total+1][digitsCount+1];
		//initialize dpArray
		/*for (int i = 0; i <= total; i++) {
			dpArray[i][0] = 0;
		}
		for (int i = 0; i <= digitsCount; i++) {
			dpArray[0][i] = 0;
		}*/
		
		int count = noOfWays(total, digitsCount);
		System.out.println("Total no of ways: " + count);
	}
	
	private static int noOfWays(int total, int digitsCount) {
		if (total <= 0 || digitsCount <= 0) {
			return 0;
		} else if (total == digitsCount) {
			return 1;
		} else return noOfWays(total-digitsCount, digitsCount)+noOfWays(total-1, digitsCount-1);
	}

}

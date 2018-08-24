package com.geeksforgeeks.matrix;

import java.util.Scanner;

import org.junit.Test;

public class NoOfSquaresInMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter matrix height:");
		int m = scanner.nextInt();
		System.out.println("Enter matrix width:");
		int n = scanner.nextInt();
		
		int total = countNoOfSquars(m,n);
		System.out.println("Total no of Squars:" + total);
	}

	private static int countNoOfSquars(int m, int n) {
		if (m == 0 || n == 0) {
			return 0;
		} else {
			return m*n + countNoOfSquars(m-1, n-1);
		}
	}
}

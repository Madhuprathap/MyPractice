package com.geeksforgeeks;

import java.util.Scanner;

public class Parser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("No Of inputs");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				String name = scanner.next();
				int id = scanner.nextInt();
				double sal = scanner.nextFloat();
				System.out.println("Name: "+ name + " id: " + id + " Sal: " + sal);
			}
		}

	}

}

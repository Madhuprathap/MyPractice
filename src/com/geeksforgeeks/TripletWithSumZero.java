package com.geeksforgeeks;

import java.util.Scanner;

import com.sort.QuickSort;

public class TripletWithSumZero {

	public static void main(String[] args) {
		System.out.print("Enter Array size:");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			input[i] = scanner.nextInt();
		}		
//		System.out.println(input.length);
		printTripletWithSumZero(input);
	}

	private static void printTripletWithSumZero(int[] input) {
		QuickSort quickSort =  new QuickSort();
		//call by reference
		quickSort.sort(input);
		for (int i = 0; i < input.length-2; i++) {
			int l = i + 1;
			int r = input.length-1;
			while( l < r) {
				int sum = input[i]+input[l]+input[r];
				if (sum == 0) {
					System.out.println("Triple : " + input[i] + "," + input[l] + "," + input[r]);
					l++; r--;
				} else if (sum < 0) {
					l++;
				} else r--;
			}
		}
	}

}

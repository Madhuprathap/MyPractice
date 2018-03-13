package com.walmart;

public class LongestSpanWithEqualSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr1 = new int[] {0, 1, 0, 0, 0, 0, 1};
		int[] arr2 = new int[] {1, 0, 1, 0, 1, 1, 1};
		
		//Process start
		if (arr1.length != arr2.length) {
			System.out.println("Different Lengths");
			System.exit(0);
		}
		
		int arr1Size = 0 , arr2Size = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 1) {
				arr1Size += 1;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] == 1) {
				arr2Size += 1;
			}
		}
		
		if (Math.abs(arr1Size-arr2Size) >= arr1.length ) {
			System.out.println("0");
		} else {
			LongestSpanWithEqaulSum(arr1, arr2, arr1Size, arr2Size, 0, arr1.length-1);
		}
	}

	private static void LongestSpanWithEqaulSum(int[] arr1, int[] arr2,
			int arr1Size, int arr2Size, int i, int j) {
		
		if (arr1Size == arr2Size) {
			System.out.println((j-i+1) + " From: " + i + " - " + j); 
			System.exit(0);
		}
		
		if (arr1Size > arr2Size) {
			if(arr1[i] != arr2[i]) {
				if (arr1[i] == 1) {
					LongestSpanWithEqaulSum(arr1, arr2, arr1Size-1, arr2Size, i+1, j);
				} else {
					if (arr1[i] == 1) {
						LongestSpanWithEqaulSum(arr1, arr2, arr1Size-1, arr2Size, i, j-1);
					}
				}
			} else if (arr1[j] != arr2[j]) {
				if (arr1[j] == 1) {
					LongestSpanWithEqaulSum(arr1, arr2, arr1Size-1, arr2Size, i, j-1);
				} else {
					if (arr1[i] == 1) {
						LongestSpanWithEqaulSum(arr1, arr2, arr1Size-1, arr2Size, i+1, j);
					}
				}
			} else {
				if (arr1[j] == arr2[j]) {
					LongestSpanWithEqaulSum(arr1, arr2, arr1Size-arr1[j], arr2Size-arr1[j], i, j-1);
				} else if (arr1[i] == arr2[i]) {
					LongestSpanWithEqaulSum(arr1, arr2, arr1Size-arr1[i], arr2Size-arr1[i], i+1, j);
				}
			}
		} else {
			if(arr1[i] != arr2[i]) {
				if (arr2[i] == 1) {
					LongestSpanWithEqaulSum(arr1, arr2, arr1Size, arr2Size-1, i+1, j);
				} else {
					if (arr2[j] == 1) {
						LongestSpanWithEqaulSum(arr1, arr2, arr1Size, arr2Size-1, i, j-1);
					}
				}
			} else if (arr1[j] != arr2[j]) {
				if (arr2[j] == 1) {
					LongestSpanWithEqaulSum(arr1, arr2, arr1Size, arr2Size-1, i, j-1);
				} else {
					if (arr2[i] == 1) {
						LongestSpanWithEqaulSum(arr1, arr2, arr1Size, arr2Size-1, i+1, j);
					}
				}
			} else {
				if (arr1[j] == arr2[j]) {
					LongestSpanWithEqaulSum(arr1, arr2, arr1Size-arr1[j], arr2Size-arr1[j], i, j-1);
				} else if (arr1[i] == arr2[i]) {
					LongestSpanWithEqaulSum(arr1, arr2, arr1Size-arr1[i], arr2Size-arr1[i], i+1, j);
				}
			}
		}
		
		
	}

}

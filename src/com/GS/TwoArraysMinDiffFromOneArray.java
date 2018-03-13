package com.GS;

public class TwoArraysMinDiffFromOneArray {
	public static void main(String[] args) {
		int[] array = new int[] {9,3,1,2,3,3};
		System.out.println(arrayPartition(array));
	}
	
	static int arrayPartition(int[] arrayOfNumbers) {
		if (arrayOfNumbers != null && arrayOfNumbers.length > 0) {
			quickSort(arrayOfNumbers, 0, arrayOfNumbers.length-1);

			int oneSum = 0;
			int secondSum = 0;
			oneSum = arrayOfNumbers[arrayOfNumbers.length -1];
			for (int i = arrayOfNumbers.length -2; i >= 0 ; i--) {
				if (oneSum < secondSum) {
					oneSum = oneSum + arrayOfNumbers[i];
				} else {
					secondSum = secondSum + arrayOfNumbers[i];
				}

			}
			return (oneSum > secondSum) ? oneSum-secondSum : secondSum - oneSum;
		} else {
			return 0;
		}
    }
	
	private static void exchangeNumbers(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
	
	private static void quickSort(int[] input,int lowIndex, int highIndex) {
		int left = lowIndex;
		int right = highIndex;
		int pivot = input[lowIndex];
		while(left < right) {
			while (input[left] <= pivot && left < highIndex) {
				left = left + 1;
			}
			while (input[right] > pivot && right > lowIndex) {
				right = right - 1;
			}
			if (left < right) {
				exchangeNumbers(input, left, right);
			}
		}
		input[lowIndex] = input[right];
		input[right] = pivot;
		if ( lowIndex < right-1) {
			quickSort(input, lowIndex, right-1);	
		}
		if (right + 1 < highIndex) {
			quickSort(input, right+1, highIndex);
		}
	}
}



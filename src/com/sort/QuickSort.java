package com.sort;

public class QuickSort {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QuickSort QS = new QuickSort();
		int input[] = {24,2,45,20,56,75,2,56,99,53,12};
		//int input[] = {5,3,1,2,4,15,1,2,5,10,15,3};
		QS.sort(input);

	}

	public void sort(int[] input) {
		if (input == null || input.length == 0) {
			System.out.println("Input is empty");
			return;
		} else {
			quickSort(input, 0, input.length-1);
			for (int i = 0; i < input.length; i++) {
				System.out.println(input[i]);
			}
		}
		
	}

	private void exchangeNumbers(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
	
	private void quickSort(int[] input,int lowIndex, int highIndex) {
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

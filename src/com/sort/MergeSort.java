package com.sort;


public class MergeSort {
	
	

	public static void main(String[] args) {
		MergeSort MS = new MergeSort();
		//int input[] = {12, 11, 13, 5, 6, 7};
		//int input[] = {24,2,45,20,56,75,2,56,99,53,12};
		int input[] = {5,3,1,2,4,15,1,2,5,10,15,3};
		MS.sort(input);
	}
	
	private void sort(int[] input) {
		if (input == null || input.length == 0) {
			System.out.println("Input is empty");
			return;
		} else {
			mergeSort(input, 0, input.length-1);
			for (int i = 0; i < input.length; i++) {
				System.out.println(input[i]);
			}
		}
		
	}

	private void mergeSort(int[] input, int l, int r) {
		if (r > l) {
			int breakPoint = (l + r)/2;
			mergeSort(input, l, breakPoint);
			mergeSort(input, breakPoint+1, r);
			merge(input, l, breakPoint,r);
		}
	}

	private void merge(int[] input, int l, int breakPoint, int r) {
		int i ,j, k;
		int n1 = breakPoint - l + 1;
		int n2 =  r - breakPoint;
		
		/* create temp arrays */
	    int L[] = new int[n1];
	    int R[] = new int[n2];
	    
		/* Copy data to temp arrays L[] and R[] */
	    for(i = 0; i < n1 /*&& i < breakPoint*/; i++)
	        L[i] = input[l + i];
	    for(j = 0; j < n2 /*&& j > breakPoint*/; j++)
	        R[j] = input[breakPoint + 1 + j];
	    
	    i = 0; j = 0; k = l;
	    
	    //merge partial elements
	    while (i < n1 && j < n2)
	    {
	        if (L[i] <= R[j])
	        {
	        	input[k] = L[i];
	            i++;
	        }
	        else
	        {
	        	input[k] = R[j];
	            j++;
	        }
	        k++;
	    }
	    
	    /* Copy the remaining elements of L[], if there are any */
	    while (i < n1)
	    {
	    	input[k] = L[i];
	        i++;
	        k++;
	    }
	 
	    /* Copy the remaining elements of R[], if there are any */
	    while (j < n2)
	    {
	    	input[k] = R[j];
	        j++;
	        k++;
	    }
	}
}

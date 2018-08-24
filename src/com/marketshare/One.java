package com.marketshare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sort.MergeSort;

public class One {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Integer x = Integer.parseInt(reader.readLine());
		System.out.println(x);*/

		int[] a = new int[] {2,4,5,9,9};
		int[] b = new int[] {0,1,2,3,4};
		int[] c = mergeArrays(a,b);
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
	}

	private static int[] mergeArrays(int[] a, int[] b) {
		int[] mergedArray = new int[a.length + b.length];
		int i = 0 , j = 0 , k = 0;
		while (i < a.length && j < b.length)
	    {
	        if (a[i] <= b[j])
	        {
	        	mergedArray[k] = a[i];
	            i++;
	        }
	        else
	        {
	        	mergedArray[k] = b[j];
	            j++;
	        }
	        k++;
	    }
	    
	    /* Copy the remaining elements of a[], if there are any */
	    while (i < a.length)
	    {
	    	mergedArray[k] = a[i];
	        i++;
	        k++;
	    }
	 
	    /* Copy the remaining elements of b[], if there are any */
	    while (j < b.length)
	    {
	    	mergedArray[k] = b[j];
	        j++;
	        k++;
	    } 
		
		return mergedArray;
	}

}

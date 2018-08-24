package com.GS;

import java.io.IOException;

public class NoOfUniqueWaysforN {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println(partition(7));
	}

	static int[] dpArray = null;
	static int partition(int num) {
		/*if (dpArray == null) {
			dpArray = new int[num+1];
			dpArray[0] = 0;
			dpArray[1] = 1;
			dpArray[2] = 2;
		} 
		
		if (dpArray[num] != 0) {
			return dpArray[num];
		}

		return partition(num-1)+partition(num-2);*/
		
		
		if (num > 0) {
			if (num == 1) {
				return 1;
			} else if (num == 2) {
				return 2;
			}
			
			return partition(num-1)+partition(num-2);
		} else {
			return 0;
		}
    }
}

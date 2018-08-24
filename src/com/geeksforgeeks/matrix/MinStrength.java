package com.geeksforgeeks.matrix;


public class MinStrength {
	static int sum = 0;
	static int length;
	static int width;
	public static void main(String[] args) {
		/*recusion(3);
		System.out.println(sum);*/
		
		int[][] inputMatrix = {{1,-3,0},{-2,1,-1}};
		int i = 0;
		width = 0;
		while (true) {
			try{
				@SuppressWarnings("unused")
				int tmp = inputMatrix[0][i++];
				++width;
			} catch (Exception e) {
				break;
			}
		}
		length = inputMatrix.length;
		int[][] dpMatrix = new int[length][width];
		
		for (int j = width; j > 0 ; j--) {
			minStrength(inputMatrix, dpMatrix, length-1, j);
		}
		
		System.out.println("Min Strength required:"+dpMatrix[0][0]);
		
	}
	
	private static int recusion(int i) {
		if (i == 0) {
			return 0;
		} else {
			int recValue = recusion(i-1);
			//System.out.println(i + "-" + recValue);
			sum = sum + i + recValue;
			return sum;
		}
		
		
	}
	
	private static void minStrength(int[][] inputMatrix, int[][] dpMatrix,
			int len, int wid) {
		if (len == length-1 && wid == width-1) {
			dpMatrix[len][wid] = 1-(inputMatrix[len][wid]);
		} 
		
	}

	private static int min(int i, int j, int k, int l) {
		if (i < j && j < k && k < l) {
			return i;
		} else if (j < k && k < l) {
			return j;
		} else if (k < l) {
			return k;
		} else {
			return l;
		} 
	}

	
}

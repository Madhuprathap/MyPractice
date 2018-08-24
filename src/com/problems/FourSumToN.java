//given a number N. print in how many ways it can be represented as N = a+b+c+d , 
//1< =a< =b< =c< = d; 1<=N< = 5000

package com.problems;

public class FourSumToN {
	
	private static int totalSum = 4;
	private static int noOfDigits = 4;
	private static int totalCount = 0;

	public static void main(String[] args) {
		int totalCount = 0;
		for (int i = 2; i >= 1; i--) {
			int digits = noOfDigits-1;
			sumCheck(totalSum-i, digits);
			
		}
		System.out.println(totalCount);
	}
	
	/**
	 * @param sum
	 * @param digits
	 * @return
	 */
	private static int sumCheck(int sum, int digits){
		if (digits == 0 && sum == 0) {
			totalCount = totalCount + 1;
			return 1;
		} else if (digits <= 0 || sum <= 0) {
			return 0;
		}
		for (int i = 2; i >= 1; i--) {
			sumCheck(sum-i, digits-1);
		}
		return 0;
	}
	
}

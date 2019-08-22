import java.math.BigInteger;

public class DataTypes {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Java does not support unsigned data types
		// byte 8 bits, int 4 bytes, short 2 bytes, long 8 bytes

		// 101 = 2^0 * 1 + 2^1 * 0 + 2^1 * 1
		// left most bit is used to store sign
		// 1 is negative & 0 is positive
		// negative are stored as 2's complement
		
		// -2
		// 00000010 -> (~ negate) 11111101 -> (+1) 11111110 = -2 this is how is written in memory
		
		// byte is 8 bits ********
		// 2^7 - 1 positive (as 0 also included) size 2^7 on negative side. 
		byte b1 = 127;
		byte b2 = -128;
		
		// 2^31 -1 = 2147483647 (as 0 also included) size 2^31 on negative side. 
		int i1 = 2147483647;
		int i2 = -2147483648;
		
		//BigInteger supports -2^Integer.MAX_VALUE to 2^Integer.MAX_VALUE
		System.out.println(Integer.MAX_VALUE);
		BigInteger bi = new BigInteger("21474836482121474836482147483648214748364847483214748364821474836482147483648214748364864821474836482147483648214748364821474836482147483648");
		System.out.println(bi);
		
		// Autoboxing
		Integer j = 10;
		// Unboxing
		int i = new Integer(10);
		
		// for float always should specify leading 'f'
//		float f = 1.9;
		
		// for double no need of specifying leading char
		double d = 1.9;
		
	}
}

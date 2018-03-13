import java.util.ArrayList;


public class SubCount {
	public static void main(String[] args) {
		int A[] = {4,5,5,6,6,7,9};
		SubCount subCount = new SubCount();
		subCount.maxSequenceLength(A);
		
		String num = new String("5");
		int no = Integer.parseInt(num);
		int _no = -Integer.parseInt(num);
		System.out.println(no);System.out.println(_no);
		
	}

	private void maxSequenceLength(int[] a) {
		int sequenceLength = 1;
		for (int i = 0; i < a.length;) {
			int j = i+1;
			for (; j < a.length; j++) {
				if (j+1 < a.length && (a[j+1]-a[i] < 2 && a[j] == (a[j+1]+1))) {
				} else {
					break;
				}
			}
			if (sequenceLength <  j-i) {
				sequenceLength = j-i;
			}
			i = j;
		}
		System.out.println(sequenceLength);
		
		System.out.println(Integer.parseInt("0"));
		System.out.println("ks8l9CMZBXDci3QW3rZIIs//GOWQBvCL69El//cSM6sGw\\=");
		
	}
}

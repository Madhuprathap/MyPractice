
public class Merge {

	public static void main(String[] args) {
		int[] a = {1,3,5,7};
		int[] b = {2,4,5,8};
		
		int i = a.length;
		int j = b.length;
		int[] out = new int[i+j];
		int aI = 0, bI = 0, oI = 0;
		while (aI < a.length && bI < b.length) {
			if (a[aI] < b[bI]) {
				out[oI++] = a[aI++];
			} else {
				out[oI++] = b[bI++];
			}
		}
		
		if (aI < a.length) {
			while (aI < a.length) {
				out[oI++] = a[aI++];
			}
		} else {
			while (bI < b.length) {
				out[oI++] = b[bI++];
			}
		}
		
		for (int k = 0; k < out.length; k++) {
			System.out.println(out[k]);
		}
		
		System.out.println(String.valueOf(new Long("-645735897877252160")));
	}

}

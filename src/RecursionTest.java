
public class RecursionTest {

	public static void main(String[] args) {
//		recursion(new int[]{0});
		recursion(0);
	}

	private static void recursion(int[] i) {
		System.out.println(i[0]);
		if (i[0] < 5) {
			i[0]=i[0]+1;
			recursion(i);
		}
		System.out.println("------");
		System.out.println(i[0]);
	}
	
	/*private static void recursion(int i) {
		System.out.println(i);
		if (i < 5) {
			recursion(++i);
		}
		System.out.println("------");
		System.out.println(i);
	}*/
	
	private static void recursion(Integer i) {
		System.out.println(i);
		if (i < 5) {
			recursion(++i);
		}
		System.out.println("------");
		System.out.println(i);
	}

}

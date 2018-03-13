
public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 = 1, n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 1; i < 20; i++) {
			int temp = n1 + n2;
			n1 = n2;
			n2 = temp;
			System.out.println(n2);
		}

	}

}

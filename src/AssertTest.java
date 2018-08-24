
public class AssertTest {

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		test2();
		
	}

	private static void test2() {
		test3();
		
	}

	private static void test3() {
		test4();
		
	}

	private static void test4() {
		System.out.println("in test4");
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.println("parent method:" + stackTraceElements[2].getMethodName());
		
	}

}

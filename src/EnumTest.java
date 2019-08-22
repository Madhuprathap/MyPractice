
public class EnumTest {
	public static void main(String[] args) {
		System.out.println(Days.ONE);
		
		System.out.println(Days.ONE.equals("one"));
		System.out.println(String.format("Pipeline found %s items to be processed", 12));
	}
}


enum Days {
	ONE("one"), TWO("two");
	String number;
	
	private Days(String number) {
		this.number = number;
	}
}
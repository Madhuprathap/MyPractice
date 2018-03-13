import java.util.Date;


public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date1 = new Date();
		for (int i = 0; i < 100000; i++) {
			
		}
		Date date2 = new Date();
		System.out.println(date1.before(date2));
		
		System.out.println(String.format("%1$-" + 5 + "0", "10"));
	}

}

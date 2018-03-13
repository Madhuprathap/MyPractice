import java.util.Date;


public class FinalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Date d1 = new Date();
		System.out.println(d1);
		Date d2 = d1;
		d2.setDate(19);
		System.out.println(d2);
		d1.setDate(1);
		System.out.println(d1);
		empTest();
	}

	private static void empTest() {
		final Employee emp = new Employee("madhu");
		System.out.println(emp.hashCode());
		emp.setName("ravi");
		System.out.println(emp.getName());
		System.out.println(emp.hashCode());
	}

}

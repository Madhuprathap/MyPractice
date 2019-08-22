
public class StaticTest {

	public static void main(String[] args) {
		Empolye.salary =100;
		System.out.println(Empolye.salary);

	}

}

class Empolye {
	public static double salary;
}

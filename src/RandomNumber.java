import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random random =  new Random();
		System.out.println(random.nextInt(9000000)+1000000);
	}

}

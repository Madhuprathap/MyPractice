import java.util.Hashtable;
import java.util.regex.Pattern;


public class RegexTest {

	public static Pattern pattern = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern = Pattern.compile("name=\"([^\"]*)\"[\r\n]+((.*[\r\n])*)------");
		System.out.println(Pattern.matches("^[\\p{L}\\p{P}\\p{N}\\p{So}\\p{Sc}\\s+%26&=&amp%\\\\\\-_|<>/]+$", "<p>madhu <script></script>oracle emp</p>\n"));
		String stg = "<p>adsfasfdasdfasdfasdfasdfasdfadsf</p>";
		System.out.println(stg.matches("^[\\p{L}\\p{P}\\p{N}\\p{So}\\p{Sc}\\s+%26&=&amp%\\\\\\-_|<>/]+$"));
		System.out.println("1".length());
		String test = "^[\\p{L}\\p{P}\\p{N}\\p{So}\\p{Sc}\\s+%26&=&amp%\\\\\\-_|<>/]+$";
		System.out.println(31&1);
		//74100285
		
		Hashtable tee = new Hashtable();
		System.out.println("Madhu".hashCode());
	}

}

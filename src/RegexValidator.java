import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexValidator {
	static String regex = "^[\\p{L}\\p{P}+=]+$";
	static String testText = ",.?:;&#39;()-{}[]/\\=_...*";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Correct regex with out escape chars: "+ regex);
		Pattern pattern = Pattern.compile(regex);
		 Matcher m = pattern.matcher(testText);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	      } else {
	         System.out.println("NO MATCH");
	      }
		
	}

}

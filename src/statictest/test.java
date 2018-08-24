package statictest;

import java.util.HashMap;
import java.util.Map;

public class test {
	One q = new One();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*System.out.println(One.test);
		One.init();
		System.out.println(One.test);
		One.test = false;
		Second.printtest();
		
		System.out.println(1%100 == 0);
		
		Map<String, String> map = new HashMap<String, String> ();
		System.out.println(String.format("%s.%03d", "002.003", 1));*/
		StringBuffer result = new StringBuffer();
		String stringValue = String.valueOf(100232);
		int lenght = stringValue.length();
		switch (lenght) {
		case 1:
			result.append("00");
			break;
		case 2:
			result.append("0");
			break;
		default:
			//Do nothing.
			break;
		}

		result.append(stringValue);
		System.out.println(result);
		
		System.out.println(String.format("%s.%03d", "002.003", 12));
		
		
		System.out.println(new Integer(1000000));
	}

}

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Scanner;

public class URLEncodeAndDeCode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String input = new Scanner(System.in).nextLine();
		String toDB = URLEncoder.encode(input,"UTF-8");
		String result = URLDecoder.decode(toDB,"UTF-8");
		
		System.out.println(toDB);
		System.out.println(result);
	}

}

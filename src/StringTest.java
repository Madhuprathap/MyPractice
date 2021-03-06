import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;

public class StringTest {
	public static void main(String[] args) {
		String toExpand = "margin-left: 30px; padding: 4px;\r\n" + 
				"<br /> , MAHDU-prathap, \r\n" + 
				"<br /> \r\n" + 
				"<br /> \r\n" + 
				"<span style=\"background-color:#FFFF00;\">sdfsdf adsfasf dfa<br /> sdfasd</span> \r\n" + 
				"<div style=\"text-align: right;\">\r\n" + 
				" asdfa adfasdf\r\n" + 
				"</div> \r\n" + 
				"<div style=\"text-align: justify;\">\r\n" + 
				" <span style=\"font-size:10px;margin-left: 40px; padding: 4px;\"><span style=\"font-family:arial,helvetica,sans-serif;\">asdf</span></span>\r\n" + 
				"</div>";
		ArrayList pieces = new ArrayList();

        int start = 0;
        for (int i = 0; i < toExpand.length(); i++) {
            char c = toExpand.charAt(i);
            if ( (c == '}' || c == '{') &&
                 (i == 0 || toExpand.charAt(i-1) != '\\') ) {
                if (start == i)
                    pieces.add("");
                else {
                    String str = toExpand.substring(start, i);
                    str = str.replaceAll("\\\\([{}])", "$1");
                    pieces.add(str);
                }
                start = i+1;
            }
        }
        if(start < toExpand.length()) {
            String str = toExpand.substring(start);
            str = str.replaceAll("\\\\([{}])", "$1");
            pieces.add(str);
        }
	}
}

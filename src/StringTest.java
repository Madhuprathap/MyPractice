import java.net.URL;
import java.net.URLDecoder;

public class StringTest {
	public static void main(String[] args) {
		String url = "http://slc11wxa.us.oracle.com:8080";
        String cleanURL = url;
        try {
            URL decodedURL = new URL(URLDecoder.decode(url, "UTF-8"));
            String urlPath = decodedURL.getPath().substring(1);
            String query = decodedURL.getQuery();
            String ref   = decodedURL.getRef();
            cleanURL = urlPath + (query != null && query.trim().length() > 0 ? "/" + query : "") + (ref != null && ref.trim().length() > 0 ? "/" + ref : "");
        } catch (Exception e) {
            String temp = url.substring(url.indexOf("://") + 3);
            cleanURL = temp.substring(temp.indexOf('/') + 1);
        }
        System.out.println(cleanURL);
        
	}
}

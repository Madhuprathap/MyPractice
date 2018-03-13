import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UTFDataFormatException;
import java.net.URLDecoder;

import org.apache.commons.io.IOUtils;


public class ReadBug {
public static void main(String[] args) throws Exception {
	/*FileInputStream fis = new FileInputStream("D:/12.txt");
	String StringFromInputStream = IOUtils.toString(fis, "UTF-8");
	System.out.println(StringFromInputStream);*/
	
	/*ReadBug rb = new ReadBug();
	 InputStream is =
		 rb.getClass().getResourceAsStream("D:/12.txt");
	 StringBuilder requestBody = new StringBuilder();
	         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));  
	         char[] charBuffer = new char[128];  
	         int bytesRead = -1;  
	         while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {  
	             requestBody .append(charBuffer, 0, bytesRead);  
	         }*/  
	   System.out.println(URLDecoder.decode("%3C1%262","UTF-8"));
		 

}
}

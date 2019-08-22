import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExtractResponseTime {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src//WithOutFullGC.txt"));
//		BufferedReader br = new BufferedReader(new FileReader("src//WithFullGC.txt"));
		long responseTime = 0;
		int noOfRequest = 0;
		String cLine;
		while ((cLine = br.readLine()) != null) {
			++noOfRequest;
			StringBuilder temp = new StringBuilder(cLine);
			int lastIndex = temp.lastIndexOf("Success")-2;
			int startIndex = lastIndex;
			while(temp.charAt(startIndex) != '\t') {
				--startIndex;
			}
			int num = 0;
			++startIndex;
			while(startIndex <= lastIndex) {
				num = num*10 + ((int)temp.charAt(startIndex)-48);
				++startIndex;
			}
			responseTime +=num;
			System.out.println(num);
		}
		System.out.println(responseTime);
		System.out.println(noOfRequest);
		System.out.println(responseTime/noOfRequest);
	}

}

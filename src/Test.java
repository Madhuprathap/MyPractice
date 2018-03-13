import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Test {

	static int test;
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String first =  scanner.nextLine();
		String second = scanner.nextLine();
		
		if (first.equals(second)) {
			System.out.println("Is anagram!");
		} else if (first.length() != second.length()){
			System.out.println("Is not anagram!");
		} else {
			HashMap<Character, Integer> map = new HashMap();
			for (int i = 0; i < first.length(); i++) {
				char temp = first.charAt(i);
				map.put(temp, map.get(temp) == null? 1 : (map.get(temp) +1));
			}
			for (int i = 0; i < second.length(); i++) {
				char temp = second.charAt(i);
				if (map.get(temp) == null) {
					break;
				}
				map.put(temp, map.get(temp) -1);
			}
			
			//check to find anagram or not
			boolean isAnagram = true;
			for (int i = 0; i < first.length(); i++) {
				if (map.get(first.charAt(i)) != 0) {
					isAnagram = false;
					break;
				}
			}
			
			if (isAnagram) {
				System.out.println("Is anagram!");
			} else {
				System.out.println("Is not anagram!");
			}
		}
	}
}

package statictest;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapTest {
	
private static String name = "madhu";	
public static void main(String[] args) {
	HashMap a = new HashMap();
	a.put("123", "123");
	a.put("1234", "1234");
	
	System.out.println(a.get("1234"));
	
	Hashtable test = new Hashtable();
	test.remove("madhu");
	
}
public void printName() {
	System.out.println(name);
}
}

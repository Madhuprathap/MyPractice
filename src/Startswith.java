import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class Startswith {
	int a ;
	public Startswith() {
		super();
		a = 12;
	}
	public Startswith(int a) {
		
	}
	  
	public void test(String num){
	    System.out.println("method with wrapper argument");
	              
	}
	public void test(int num){
	    System.out.println("method with primitive argument");
	              
	}
	
abstract class chech {
	abstract void b();
}

public static void main(String[] args) {
	String test = "/imws";
	int[][] multD = new int[4][];
	
	if (test.startsWith("/")) {
		System.out.println("starts");
	}
	
	String name = null;
	if (test.startsWith("/")) {
		name ="/madhu";
	} else {
		name = "madhu";
	}
	System.out.println(name);
	
	String test1 ="8081/";
	String test2 ="8081/";
	if (test1.endsWith("/")) {
		test2 = test1.substring(0,test1.length()-1);
	} else {
		test2 = test1;
	}
	System.out.println(test2);
	
	Employee emp = new Employee(null);
	System.out.println("dsfffffffffffff"+emp);
	Startswith sw = new Startswith();
	sw.test(String.valueOf(12));
	
	
	String deco = URLDecoder.decode("%0d%0a");
	
	System.out.println("test->"+deco);
	
	System.out.println("madhu|prathap".replace("|", "_"));
}
}

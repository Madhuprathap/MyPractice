
public class InternString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = new String("Java");
		s1 = s1.intern();
		String s2 = "Java";
		System.out.println(s1==s2);
		s1=s1.replace('a', 'b');
		System.out.println(s1==s2);
		s1 = s1.intern();
		s2 = "Jbvb";
		System.out.println(s1==s2);
	}
	
}

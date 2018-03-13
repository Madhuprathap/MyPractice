import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class SetToArray {

	private final static String myName = "madhu{lastname}";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean flag = true;
		HashMap myMap = new HashMap<String, Object>();
		myMap.put("1", "1");
		HashMap liveMap = new HashMap<String, Object>();
		liveMap.put("2", "2");
		HashMap visited = new HashMap<String, Object>(myMap);
		visited.putAll(liveMap);
		
		assert("madhu12".equals("madhu"));
		System.out.println(myMap.size());
		System.out.println(myMap.get("1"));
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.remove(2);
		
		System.out.println(list);
	}

}

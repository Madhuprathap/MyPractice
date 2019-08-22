import java.util.HashMap;
import java.util.HashSet;

public class CollectionTest {

	public static void main(String[] args) {
		HashMap<Employee, String> map = new HashMap<Employee, String>();
		System.out.println(map.put(new CollectionTest.Employee("Madhu", 1), "Madhu prathap1"));
		// Map will replace Entry if key hashcode and equals are same, because value can be different
		System.out.println(map.put(new CollectionTest.Employee("Madhu", 1), "Madhu prathap Replaced"));
		System.out.println(map.put(new CollectionTest.Employee("Prathap", 1), "Madhu prathap2"));
		System.out.println(map.size());
		System.out.println(map.get(new CollectionTest.Employee("Madhu", 1)));
		
		HashSet<Employee> set = new HashSet<Employee>();
		set.add(new CollectionTest.Employee("Madhu", 1));
		// set will not replace Entry if key hashcode and equals are same, don't replace because value is dummy same object here.
		System.out.println(set.add(new CollectionTest.Employee("Madhu", 1)));
		// forms linked list if equals not same but hashcode is same
		System.out.println(set.add(new CollectionTest.Employee("Prathap", 1)));
		System.out.println(set.size());
	}
	
	static class Employee {
		
		private String name;
		private int id;
		
		public Employee(String name, int id) {
			this.name = name; 
			this.id = id;
		}
		
		@Override
		public String toString() {
			return name.toString() + id + super.toString();
		}
		
		@Override
		public boolean equals(Object obj) {
			return this.name.equals(((Employee)obj).name);
		}
		
		@Override
		public int hashCode() {
			return id;
		}
	}

}

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.IsInstanceOf;

import com.runtimepolymorphism.Base;
import com.runtimepolymorphism.Derived;

public class CollectionsTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(2));
		list.add("a String");
		System.out.println(list.get(1) instanceof String);
		list.add(0, "added value");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
		// new ArrayList(); it does not matter put <> or not
		List<Base> inheritance = new ArrayList<>();
//		inheritance.add("Madhu");
		inheritance.add(new Base());
//		You can place any child/inherited class object
		inheritance.add(new Derived());
	}

}

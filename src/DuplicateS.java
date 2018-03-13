import java.util.HashMap;
import java.util.Map;

public class DuplicateS {

	public static void main(String[] args) {
		int[] numbers = {1,1,2,2,3,4,5,1,2};
		//<Integer, Integer>
		Map<Integer, Integer> containerMap = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (containerMap.containsKey(numbers[i])) {
				if(containerMap.get(numbers[i]).equals(1)) {
					containerMap.put(numbers[i], containerMap.get(numbers[i])+1);
					count++;
				} 
			} else {
				containerMap.put(numbers[i], 1);
			}
		}
		System.out.println(count);
	}

}

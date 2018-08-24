
public class FirstRepeatingChar {

	public static void main(String[] args) {

		String input = "abcba";

		int[] container = new int[52];
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i)-97 >= 0 && input.charAt(i)-97 < 26) {
				container[input.charAt(i) - 97] = container[input.charAt(i) - 97] + 1;
			} else {
				container[input.charAt(i) - 97+26] = container[input.charAt(i) - 97+26] + 1;
			}

		}

		StringBuilder out = new StringBuilder();
		
		for (int i = 0; i < container.length; i++) {
			if (container[i] > 1) {
				out.append(Character.toChars(i+97));
				break;
			}
		}
		
		System.out.println(out.toString());
	}
}

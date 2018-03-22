
public class GoToBreakLoop {
	public static void main(String[] args) {
		{
			int i = 0;
			_loop1:
			do {
				System.out.println(i);
				i++;
				if (i >= 10) {
					break _loop1;
				}
			} while(true);
			System.out.println("Done");
		}
		System.out.println("Done");
	}
}

import org.omg.CORBA.portable.ValueBase;


public enum Color {
	RED(1), BLUE(2), GREEN(3);
	
	private int valueBase;
	private Color(int value) {
		this.valueBase = value;
	}
	
	public int getValueBase() {
		return valueBase;
	}
}

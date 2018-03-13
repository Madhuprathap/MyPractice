package com.circularDependency;

public class Building {

	public int getFloors() {
		return floors;
	}

	private void setFloors(int floors) {
		this.floors = floors;
	}

	private int floors;
	public Lift lift;
	
	public Building() {
		setFloors(15);
		lift = new Lift(this);
	}

	public Building deepCopy() {
		Building copied = new Building();
		copied.setFloors(25);
		Lift copiedLift = lift.deepCopy(copied);
		copied.lift = copiedLift;
		return copied;
	}
	
}

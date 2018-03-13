package com.circularDependency;

public class Lift {
	
	private int speed;
	private Building building;
	
	public Lift(Building building) {
		this.building = building;
		setSpeed();
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed() {
		if (building.getFloors() > 20) {
			speed = 20;
		} else {
			speed = 10;
		}
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public Lift deepCopy(Building build) {
		Lift copied = new Lift(build);
		copied.setSpeed();
		return copied;
	}
	
	

}

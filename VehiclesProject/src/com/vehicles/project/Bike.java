package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void addWheels(List<Wheel> frontWheel, List<Wheel> backWheel) throws Exception {
		addOneWheel(frontWheel);
		addOneWheel(backWheel);
	}

	public void addOneWheel(List<Wheel> wheel) throws Exception {
		if (wheel.size() != 1)
			throw new Exception("ERROR: Una moto t� una roda trasera i una davantera");

		this.wheels.add(wheel.get(0));
	}

}

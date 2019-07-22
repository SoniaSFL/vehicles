package com.vehicles.project;

import java.util.List;

public class Fase1 {

	public static void main(String[] args) {
		
		List<Wheel> frontWheels;
		List<Wheel> backWheels;
		
		// Create car
		Car newCar = Fase1Tools.getCar();
		
		// Add wheels
		try {
			System.out.println("Selecciona les rodes traseres:");
			backWheels = Fase1Tools.getCarWheels();
			System.out.println("Selecciona les rodes davanteres:");
			frontWheels = Fase1Tools.getCarWheels();
			newCar.addWheels(frontWheels, backWheels);
		} catch (NumberFormatException e) {
			System.out.println("ERROR: Diàmetre incorrecte");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}

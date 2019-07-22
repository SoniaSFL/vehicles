package com.vehicles.project;

import java.util.List;

public class Fase2 {

	public static void main(String[] args) {
		
		List<Wheel> frontWheels;
		List<Wheel> backWheels;
		
		// Create car
		Vehicle newCar = Tools.getVehicle();
		
		// Add wheels
		try {
			System.out.println("Selecciona les rodes traseres:");
			backWheels = Tools.getCarWheels();
			System.out.println("Selecciona les rodes davanteres:");
			frontWheels = Tools.getCarWheels();
			newCar.addWheels(frontWheels, backWheels);
		} catch (NumberFormatException e) {
			System.out.println("ERROR: Diàmetre incorrecte");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
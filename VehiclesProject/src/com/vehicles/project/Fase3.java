package com.vehicles.project;

import java.util.List;

public class Fase3 {

	public static void main(String[] args) {
		
		int vehicleType;
		List<Wheel> frontWheels;
		List<Wheel> backWheels;
		
		// Create vehicle
		vehicleType = Tools.getVehicleType();
		Vehicle newVehicle = Tools.getVehicle(vehicleType);
		
		// Add wheels
		try {
			if (vehicleType == 1) {
				System.out.println("Selecciona la roda trasera:");
				backWheels = Tools.getBikeWheels();
				System.out.println("Selecciona la roda davantera:");
				frontWheels = Tools.getBikeWheels();
			} else {
				System.out.println("Selecciona les rodes traseres:");
				backWheels = Tools.getCarWheels();
				System.out.println("Selecciona les rodes davanteres:");
				frontWheels = Tools.getCarWheels();
			}
			newVehicle.addWheels(frontWheels, backWheels);
		} catch (NumberFormatException e) {
			System.out.println("ERROR: Diàmetre incorrecte");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}

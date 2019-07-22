package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tools {
	
	public static String scanLine(String question) {
		System.out.println(question);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static int getVehicleType() {
		int vehicleType;
		String line = "";
		while (!line.equals("1") && !line.equals("2")) {
			line = scanLine("Selecciona el tipus de vehicle" + "\n" + "1. Moto"+ "\n" + "2. Cotxe");
		}
		vehicleType = Integer.parseInt(line);
		return vehicleType;
	}
	
	private static String checkPlate(String plate) {
		int i;
		boolean correct = false;
		while (correct == false) {
			int numbers = 0;
			int letters = 0;
			for (i = 0; i < plate.length(); i++) {
				Character letter = plate.charAt(i);
				if (Character.isDigit(letter)) {
					numbers++;
				} else if (Character.isLetter(letter)){
					letters++;
				}
			}
			if (numbers==4 && (letters == 2 || letters == 3)) {
				correct = true;
			} else {
				plate = scanLine("Una matrícula ha de tenir 4 números i 2 o 3 lletres" + "\n" + "Torna a introduir la matrícula del vehicle");
			}
		}
		return plate;
	}
	
	public static Vehicle getVehicle() {
		String plate = scanLine("Introdueix la matrícula del vehicle");
		plate = checkPlate(plate);
		String brand = scanLine("Introdueix la marca del vehicle");
		String color = scanLine("Introdueix el color del vehicle");
		return new Car(plate, brand, color);
	}
	
	public static Vehicle getVehicle(int vehicleType) {
		String plate = scanLine("Introdueix la matrícula del vehicle");
		plate = checkPlate(plate);
		String brand = scanLine("Introdueix la marca del vehicle");
		String color = scanLine("Introdueix el color del vehicle");
		if (vehicleType == 1) {
			return new Bike(plate, brand, color);
		} else {
			return new Car(plate, brand, color);
		}
	}
	
	private static Double checkDiameter(Double wheelDiameter) {
		while (wheelDiameter <= 0.4 || wheelDiameter >= 4) {
			String line = scanLine("El diàmetre ha de ser superior a 0.4 i inferior a 4" + "\n" + "Torna a introduir el diàmetre");
			wheelDiameter = Double.parseDouble(line);
		}
		return wheelDiameter;
	}
	
	private static Wheel getWheel() {
		String wheelBrand = scanLine("- Introdueix la marca de la roda");
		String line = scanLine("- Introdueix el diàmetre de la roda");
		Double wheelDiameter = Double.parseDouble(line);
		wheelDiameter = checkDiameter(wheelDiameter);
		return new Wheel(wheelBrand, wheelDiameter);
	}
	
	public static List<Wheel> getCarWheels() {
		List<Wheel> wheels = new ArrayList<>();
		System.out.println("Selecciona la roda dreta");
		wheels.add(getWheel());
		System.out.println("Selecciona la roda esquerra");
		wheels.add(getWheel());
		return wheels;
	}
	
	public static List<Wheel> getBikeWheels() {
		List<Wheel> wheels = new ArrayList<>();
		wheels.add(getWheel());
		return wheels;
	}
	
}

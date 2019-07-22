package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fase1Tools {
	
	public static String scanLine(String question) {
		System.out.println(question);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static Car getCar() {
		String plate = scanLine("Introdueix la matrícula del vehicle");
		String brand = scanLine("Introdueix la marca del vehicle");
		String color = scanLine("Introdueix el color del vehicle");
		return new Car(plate, brand, color);
	}
	
	private static Wheel getWheel() {
		String wheelBrand = scanLine("- Introdueix la marca de la roda");
		String line = scanLine("- Introdueix el diàmetre de la roda");
		Double wheelDiameter = Double.parseDouble(line);
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
	
}
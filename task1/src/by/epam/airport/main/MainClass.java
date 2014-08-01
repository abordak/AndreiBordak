package by.epam.airport.main;

import by.epam.airport.comparator.TreeSetWithComparator;
import by.epam.airport.creator.PlaneListCreator;
import by.epam.airport.entity.Airport;

import by.epam.airport.logic.LogicClass;

public class MainClass {

	
	
	public static void main(String[] args) {
		
		
		Airport airport = new Airport("Minsk-1", PlaneListCreator.createPlaneList());

		System.out.println(airport.toString());
		System.out.println(TreeSetWithComparator.sortPlanes(airport.getPlanes()));

		System.out.println("Total seating:  "+ LogicClass.getSeating(airport));
		System.out.println("Total capacity: "+LogicClass.getCapacity(airport)+"\n");

		System.out.println(LogicClass.getPlanesByFuel(airport, 100, 10000));
		
	}

}

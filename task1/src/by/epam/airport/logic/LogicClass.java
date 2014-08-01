package by.epam.airport.logic;


import by.epam.airport.entity.Airport;
import by.epam.airport.entity.Plane;

public class LogicClass {

	public static int getSeating(Airport airport){
		int totalSeating=0;
	
		for (Plane plane: airport.getPlanes()){
			
			totalSeating+=plane.getSeating();
		}
		return totalSeating;
	}
	
	public static int getCapacity(Airport airport){
		int totalCapacity=0;
		
		for (Plane plane: airport.getPlanes()){
			
			totalCapacity+=plane.getCapacity();
		}
		return totalCapacity;
	}
	
	public static String getPlanesByFuel(Airport airport, int lowValue, int highValue){
		StringBuilder builder = new StringBuilder();
		
		for (Plane plane:airport.getPlanes()){
			if ((plane.getFuelConsumption()>=lowValue)&&(plane.getFuelConsumption()<=highValue)){
				builder.append("Name "+plane.getName());
				builder.append(" FuelConsumption "+plane.getFuelConsumption());
				builder.append("\n");
			}
		}
		return builder.toString();
	}
}

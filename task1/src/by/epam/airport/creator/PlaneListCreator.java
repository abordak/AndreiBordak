package by.epam.airport.creator;

import java.util.LinkedList;
import java.util.List;
import by.epam.airport.entity.Plane;

public class PlaneListCreator {

	public static List<Plane> createPlaneList(){
			
		List<Plane> planes = new LinkedList<Plane>();
		Director director = new Director();
		AbstractBuilder buisnessBuilder = new BuisnessAirlinerBuilder();
		AbstractBuilder economyBuilder = new EconomyAirlinerBuilder();
		AbstractBuilder freighterBuilder = new FreighterBuilder();
		
		director.setPlaneBuilder(buisnessBuilder);
		director.constructPlain();
		planes.add(director.getPlane());
		
		director.setPlaneBuilder(economyBuilder);
		director.constructPlain();
		planes.add(director.getPlane());
		
		director.setPlaneBuilder(freighterBuilder);
		director.constructPlain();
		planes.add(director.getPlane());
		
		return planes;
		
	}
}

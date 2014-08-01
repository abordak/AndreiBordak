package by.epam.airport.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import by.epam.airport.entity.Plane;

public class TreeSetWithComparator {

	public static String sortPlanes(List<Plane> planes){
		
		StringBuilder builder = new StringBuilder();
		
		Comparator<Plane> comparator = new PlaneRangeComparator();
		Set<Plane> set = new TreeSet<Plane>(comparator);
		
		for (Plane plane: planes){
			set.add(plane);
		}
		
		builder.append("A sorted set of planes by range: \n");
		for (Plane plane :set){
			
			builder.append("Name ");
			builder.append(plane.getName());
			builder.append(" Range ");
			builder.append(plane.getRange());
			builder.append("\n");
		}
		return builder.toString();
	}
}

package by.epam.airport.comparator;

import java.util.Comparator;

import by.epam.airport.entity.Plane;

public class PlaneRangeComparator implements Comparator<Plane> {

	@Override
	public int compare(Plane p1, Plane p2) {
		
		int range1 = p1.getRange();
		int range2 = p2.getRange();
		
		if (range1<range2){
			return -1;
		} else if (range1==range2){
			return 0;
		} else {
			return 1;
		}	
	}
	

}

package print;

import java.util.LinkedList;

import by.epam.airport.entity.Airliner;
import by.epam.airport.entity.Freighter;


public class Print {

	public Print(){	}
	
	public void getInfo(LinkedList<Airliner> airliners, LinkedList<Freighter> freighters){
		
		for (Airliner plane: airliners){
			System.out.println(plane.toString());
		}
		
		for (Freighter plane : freighters){
			System.out.println(plane.toString());
		}
	}
}

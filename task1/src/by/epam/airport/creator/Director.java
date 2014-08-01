package by.epam.airport.creator;

import by.epam.airport.entity.Plane;

public class Director {

	private AbstractBuilder planeBuider;
	
	public void setPlaneBuilder(AbstractBuilder planeBuilder){
		this.planeBuider=planeBuilder;
	}
	
	public Plane getPlane(){
		return planeBuider.getPlane();
	}
	
	public void constructPlain(){
		
		planeBuider.createPlane();
		planeBuider.setName();
		planeBuider.setMaxHeight();
		planeBuider.setFuelConsumption();
		planeBuider.setRange();
		planeBuider.setSeating();
		planeBuider.setMaxSpeed();
		planeBuider.setMinSpeed();
		planeBuider.setCapacity();
	}
}

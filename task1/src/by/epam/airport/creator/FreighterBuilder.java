package by.epam.airport.creator;

import by.epam.airport.entity.Freighter;
import by.epam.airport.entity.Plane;

public class FreighterBuilder extends AbstractBuilder {

	private Freighter plane;
	
	@Override
	public void createPlane() {
		plane = new Freighter();
		
	}
	
	@Override
	public Plane getPlane() {
		
		return this.plane;
	}

	@Override
	public void setName() {	
		plane.setName("AH225");
	}

	@Override
	public void setMaxHeight() {
		plane.setMaxHeight(11000);
		
	}

	@Override
	public void setFuelConsumption() {
		plane.setFuelConsumption(1500);
		
	}

	@Override
	public void setRange() {
		plane.setRange(11000);
		
	}
	
	@Override
	public void setSeating() {}
	@Override
	public void setMaxSpeed() {}
	
	@Override
	public void setMinSpeed() {}

	@Override
	public void setCapacity() {
		plane.setCapacity(400000);
		
	}

}

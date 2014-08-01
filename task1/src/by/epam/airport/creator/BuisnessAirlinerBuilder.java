package by.epam.airport.creator;

import by.epam.airport.entity.BuisnessClassAirliner;
import by.epam.airport.entity.Plane;

public class BuisnessAirlinerBuilder extends AbstractBuilder{

	private BuisnessClassAirliner plane;
	
	@Override
	public void createPlane() {
		plane = new BuisnessClassAirliner();
		
	}
	
	@Override
	public Plane getPlane() {
		
		return this.plane;
	}

	@Override
	public void setName() {	
		plane.setName("Boeing777");
	}

	@Override
	public void setMaxHeight() {
		plane.setMaxHeight(10000);
		
	}

	@Override
	public void setFuelConsumption() {
		plane.setFuelConsumption(1000);
		
	}

	@Override
	public void setRange() {
		plane.setRange(10000);
		
	}
	
	@Override
	public void setSeating() {
		plane.setSeating(300);
		
	}
	@Override
	public void setMaxSpeed() {
		plane.setMaxSpeed(900);		
	}
	
	@Override
	public void setMinSpeed() {}

	@Override
	public void setCapacity() {}

}

package by.epam.airport.creator;

import by.epam.airport.entity.EconomyClassAirliner;
import by.epam.airport.entity.Plane;

public class EconomyAirlinerBuilder extends AbstractBuilder {

	private EconomyClassAirliner plane;
	
	@Override
	public void createPlane() {
		plane = new EconomyClassAirliner();
		
	}
	
	@Override
	public Plane getPlane() {
		
		return this.plane;
	}

	@Override
	public void setName() {	
		plane.setName("Boeing747");
	}

	@Override
	public void setMaxHeight() {
		plane.setMaxHeight(9000);
		
	}

	@Override
	public void setFuelConsumption() {
		plane.setFuelConsumption(900);
		
	}

	@Override
	public void setRange() {
		plane.setRange(90000);
		
	}
	
	@Override
	public void setSeating() {
		plane.setSeating(250);
		
	}
	@Override
	public void setMaxSpeed() {}
	
	@Override
	public void setMinSpeed() {
		plane.setMinSpeed(300);
	}

	@Override
	public void setCapacity() {}
}

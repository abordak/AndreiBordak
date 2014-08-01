package by.epam.airport.creator;

import by.epam.airport.entity.Plane;

public abstract class AbstractBuilder {

	public abstract void createPlane();
	public abstract Plane getPlane();
	
	public abstract void setName();
	public abstract void setMaxHeight();
	public abstract void setFuelConsumption();
	public abstract void setRange();
	public abstract void setSeating();
	public abstract void setMaxSpeed();
	public abstract void setMinSpeed();
	public abstract void setCapacity();
}

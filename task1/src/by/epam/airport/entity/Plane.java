package by.epam.airport.entity;

public abstract class Plane {
	
	private String name;
	private int maxHeight;
	private int fuelConsumption;
	private int range;
	
	public Plane(){}
	
	public Plane(String name, int maxHeight,
					int fuleConsumption, int range){
		this.name = name;
		this.maxHeight = maxHeight;
		this.fuelConsumption = fuleConsumption;
		this.range = range;	
		
		
	}
	
	public abstract void fly();
	public abstract int getSeating();
	public abstract int getCapacity();
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMaxHeight() {
		return maxHeight;
	}


	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}


	public int getFuelConsumption() {
		return fuelConsumption;
	}


	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
	
		builder.append("Name ");
		builder.append(this.name);
		builder.append(" MaxHeight ");
		builder.append(this.maxHeight);
		builder.append(" Fuel Consumption ");
		builder.append(this.fuelConsumption);
		builder.append(" Range ");
		builder.append(this.range);
		
		return builder.toString();
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj){
            return true;
		}else if (obj == null){
            return false;
        }else if (getClass() != obj.getClass())
            return false;
        Plane plane = (Plane)obj;
        if (name!=plane.getName()){
        	return false;
        }else if(maxHeight!=plane.getMaxHeight()){
        	return false;
        }else if(fuelConsumption!=plane.getFuelConsumption()){
        	return false;
        }else if(range!=plane.getRange()){
        	return false;
        }
        return true;
	}
	
	@Override
	public int hashCode(){
		int code = 11;
	    int k = 7;
	    code = k*code + maxHeight;
	    code = k*code + name.hashCode();
	    return code;
	}
}

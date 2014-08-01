package by.epam.airport.entity;

public class BuisnessClassAirliner extends Airliner {

	private int maxSpeed;
	
	public BuisnessClassAirliner() {}
	
	public BuisnessClassAirliner(String name, int maxHeight, int fuelConsumption,
									int range, int seating, int maxSpeed){
		super(name, maxHeight, fuelConsumption, range, seating);
		this.setMaxSpeed(maxSpeed);
	}
	
	

	public void fly(){
		System.out.println("Overboard temperature : 15 degrees of Celcius");
	}
	
	

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString(){
		
		StringBuilder builder = new StringBuilder();
		builder.append(" maxSpeed ");
		builder.append(this.maxSpeed);
		
		return super.toString()+builder.toString();
	}
	
	@Override
	public boolean equals(Object obj){
		
		Freighter plane = (Freighter)obj;
		if (maxSpeed!=plane.getCapacity()){
			return false;
		}
		
        return super.equals(obj);
	}
	
	@Override
	public int hashCode(){
		int code = 11;
	    int k = 7;
	    code = k*code + maxSpeed;	    
	    return code;
	}
}

package by.epam.airport.entity;

public class EconomyClassAirliner extends Airliner {

	private int minSpeed;
	
	public EconomyClassAirliner(String name, int maxHeight, int fuelConsumption,
									int range, int seating, int minSpeed){
		super(name, maxHeight, fuelConsumption, range, seating);
		this.minSpeed=minSpeed;
	}
	
	public EconomyClassAirliner() {	}

	public void fly(){
		System.out.println("Overboard temperature : 15 degrees of Celcius");
	}
	


	public int getMinSpeed() {
		return minSpeed;
	}

	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}
	
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(" MinSpeed ");
		builder.append(this.minSpeed);
		
		return super.toString()+builder.toString();
	}
	
	@Override
	public boolean equals(Object obj){
		
		EconomyClassAirliner plane = (EconomyClassAirliner)obj;
		if (minSpeed!=plane.getMinSpeed()){
			return false;
		}
		
        return super.equals(obj);
	}
	
	@Override
	public int hashCode(){
		int code = 11;
	    int k = 7;
	    code = k*code + minSpeed;	    
	    return code;
	}
}

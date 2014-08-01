package by.epam.airport.entity;




public class Airliner extends Plane {

		
	private int seating;
	
	public Airliner(){}
	
	public Airliner (String name, int maxHeight, int fuelConsumption,
						int range, int seating){
		
		super(name, maxHeight, fuelConsumption, range);

		this.seating = seating;
	}
	
	public void fly() {
		System.out.println("Overboard temperature : 15 degrees of Celcius");
	}
	
	@Override
	public int getCapacity(){
		return 0;
	}
	
	@Override
	public int getSeating() {
		return seating;
	}

	public void setSeating(int seating) {
		this.seating = seating;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(" Seating ");
		builder.append(this.seating);
		
		return super.toString()+builder.toString();
	}

	@Override
	public boolean equals(Object obj){
		
		Airliner plane = (Airliner)obj;
		if (seating!=plane.getSeating()){
			return false;
		}
		
        return super.equals(obj);
	}
	
	@Override
	public int hashCode(){
		int code = 11;
	    int k = 7;
	    code = k*code + seating;	    
	    return code;
	}
}

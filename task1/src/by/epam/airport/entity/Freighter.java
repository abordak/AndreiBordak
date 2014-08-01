package by.epam.airport.entity;



public class Freighter extends Plane {

	String nameFile;
	
	private int capacity;
	
	public Freighter(){}
	
	public Freighter(String name, int maxHeight,int fuelConsumption,
						int range, int capacity){

		super(name, maxHeight, fuelConsumption, range);
		this.capacity=capacity;
		
	}
	
	public void fly() {
		System.out.println("Overboard temperature : 15 degrees of Celcius");
	}
	

	@Override
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public int getSeating() {
		return 0;
	}
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(" Capacity ");
		builder.append(this.capacity);
		return super.toString()+builder.toString();
	}


}

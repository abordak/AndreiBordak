package by.epam.airport.entity;

import java.util.List;


public class Airport {

		private List<Plane> planes;
		private String name;
		
	
		public Airport(){}

		public Airport(String name, List<Plane> planes){	
			
			this.setName(name);
			this.planes = planes;
		}


		public List<Plane> getPlanes() {
		
			return this.planes;
		}

		public void setPlanes(List<Plane> planes) {
			this.planes = planes;
		}
			
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString(){
			StringBuilder builder = new StringBuilder();
			builder.append("Name ");
			builder.append(this.getName());
			builder.append("\n");
			for (Plane plane: planes){
				builder.append(" Plane ");	
				builder.append(plane.getName());
				builder.append("\n");
			}
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
	        Airport airport = (Airport)obj;
	        if (name!=airport.getName()){
	        	return false;
	        }
	        return true;
		}
		
		@Override
		public int hashCode(){
			int code = 11;
		    int k = 7;
		    code = k*code + name.hashCode();
		    return code;
			
		}
		
}

package March2017.polymo;

import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	public static List <Vehicle> convertArray(Object[] vehicleArray) {
		
		List<Vehicle>convert= new ArrayList<Vehicle>();
		for ( Object veh : vehicleArray) {
			Vehicle  x= (Vehicle)veh;
			convert.add(x);
		}
			return convert;
		}
	
		
	
	
	
	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		int total =0;
		for (Vehicle vehicle : vehicleList) {
			total+=vehicle.getMilesUsedToday();
			
		}
		return total;
	}
		
		
}

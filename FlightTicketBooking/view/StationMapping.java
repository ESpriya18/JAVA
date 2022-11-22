package view;

import java.util.HashMap;
//import java.util.logging.Logger;

public class StationMapping {
//	 static Logger logger=Logger.getLogger(StationMapping.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>airportStations=new HashMap<String,String>();
		airportStations.put("MAA", "Chennai");
		airportStations.put("CBE","Coimbatore");
		airportStations.put("TN","Tuticorin");
		airportStations.put("HYD", "Hyderabad");
		airportStations.put("BLR","Bangalore");
		
	System.out.println(airportStations);


	}
}

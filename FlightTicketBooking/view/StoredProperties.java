package view;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class StoredProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    Properties airportStations=new Properties();
    airportStations.setProperty("MAA", "Chennai");
	airportStations.setProperty("CBE","Coimbatore");
	airportStations.setProperty("TN","Tuticorin");
	airportStations.setProperty("HYD", "Hyderabad");
	airportStations.setProperty("BLR","Bangalore");
	
	airportStations.store(new FileWriter("station.properties"),"Properties stored.....");
	}

}

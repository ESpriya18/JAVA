package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreatingPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    Properties airportStations=new Properties();
    airportStations.put("MAA", "Chennai");
	airportStations.put("CBE","Coimbatore");
	airportStations.put("TN","Tuticorin");
	airportStations.put("HYD", "Hyderabad");
	airportStations.put("BLR","Bangalore");
	
	String  path="/home/zoho/Documents/station.properties";
	FileOutputStream outputStream = new FileOutputStream(path);
	airportStations.store(outputStream, "List of Station properties");
	System.out.println("Properties file created for AirportStations....!");
	}

}

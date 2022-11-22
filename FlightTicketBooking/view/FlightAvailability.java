package view;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import model.JdbcConnectionClass;
public class FlightAvailability {
	
	Logger logger=Logger.getLogger(FlightAvailability.class.getName());
	
	protected void availableFlights()
	{
		try {
			Statement statement = JdbcConnectionClass.getInstance().createStatement();
			
			ResultSet flightAvailability = statement.executeQuery("select *from FLIGHTAVAILABILITY");
			
			if(!flightAvailability.next())
			{
				System.out.println("Empty List");
				return;
			}
			System.out.println("To check Available flights for trips");
			System.out.println("------------------------------------------------------------------");
			System.out.println("DATEAVAILABILITY\tDEPARTURETIME\tFLIGHTNO\tTRAVELCLASS");
			System.out.println("------------------------------------------------------------------");
			do
			{
				System.out.println(flightAvailability.getString(1)+"\t\t"+flightAvailability.getString(2)+"\t\t"+flightAvailability.getString(3)+"\t"+"\t"+flightAvailability.getString(4));
			}while(flightAvailability.next());
			System.out.println("------------------------------------------------------------------");
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

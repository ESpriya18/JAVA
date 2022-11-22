package view;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import model.*;

public class ViewFlightDetails {
	
	Logger logger=Logger.getLogger(ViewFlightDetails.class.getName());
	
	protected void viewFlightDetails() 
	{
		Statement statement;
		try {
			statement = JdbcConnectionClass.getInstance().createStatement();
			ResultSet flightInfo =  statement.executeQuery("select *from FLIGHTDETAILS");

			System.out.println("FLIGHTNO\tFLIGHTNAME\t\tSOURCE\t\tDESTINATION\t\tTRAVELDURATION\t");
//			logger.fine("FLIGHTNO\tFLIGHTNAME\tSOURCE\tDESTINATION\tTRAVELDURATION\t");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------");
			
			while(flightInfo.next())
			{
//				logger.fine(flightInfo.getString(1)+"\t"+flightInfo.getString(2)+"\t\t"+flightInfo.getString(3)+"\t\t"+flightInfo.getString(4)+"\t"+flightInfo.getString(5));
				System.out.println(flightInfo.getString(1)+"\t\t"+flightInfo.getString(2)+"\t\t\t"+flightInfo.getString(3)+"\t\t"+flightInfo.getString(4)+"\t"+flightInfo.getString(5));
			}	
			System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package view;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;


import controller.*;

public class FlightTIcketBookingManagement {
	
	 
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
   
    
		FlightTicket bookTicket = new FlightTicket();
		bookTicket.flightTicketBooking();
	}

}
class FlightTicket  
{
	 Logger logger=Logger.getLogger(FlightTicket.class.getName());
	private Scanner scanner = new Scanner(System.in);
	protected void flightTicketBooking() 
	{
//		logger.setLevel(Level.FINE);
//		logger.fine("welcome to booking Flight");
		System.out.println("Welcome to Booking Flight Ticket");
//		
//		Logger.getLogger("----------------------------------");
		System.out.println("--------------------------------");
		while(true)
		{
//			logger.info("1.view flight details");
			System.out.println("1. View Flight Details");
			
//			logger.info("2.Book Ticket");
			System.out.println("2. Book Ticket");
			
//			logger.info("3.Cancel Ticket");
			System.out.println("3. Cancel Ticket");
			
//			logger.info("4.Show Passenger Ticket Details");
			System.out.println("4. Show Passenger Ticket Details");
			
//			logger.info("5.To check available flights");
			System.out.println("5. Flight Availability Details");
			
//			logger.info("6.Exit");
			System.out.println("6. Exit");
			
//			logger.info("Enter your option");
			System.out.println("Enter your option");
			int choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				
					ViewFlightDetails viewFlight = new ViewFlightDetails();
					viewFlight.viewFlightDetails();

				break;
			case 2:
				try {
					BookingTicket booking = new BookingTicket();
					booking.bookFlightTicket();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				break;
			case 3:
				CancelTicket cancel = new CancelTicket();
				cancel.cancelTicket();
				break;
			case 4:
				PassengerDetails passengerDetail = new PassengerDetails(); 
				passengerDetail.showPassengerDetails();
				break;
			case 5:
				FlightAvailability flightAvailability = new FlightAvailability();
 				flightAvailability.availableFlights();
				break;
			case 6:
				return;
			default:
				System.out.println("Enter proper input");
				break;
			}
		}
			
	}
}

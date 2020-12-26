package com.xworkz.xworkzapp.flight.util;

import com.xworkz.xworkzapp.flight.FlightBooking;

public class FlightBookingUtil {
	public static void main(String[] args) {
		
		FlightBooking fb=new FlightBooking();
		fb.setAirPlaneCode("123abc");
		fb.setCompany("Indigo");
		fb.setTicketPrice(25000.00);
		System.out.println(fb.getAirPlaneCode()+" "+fb.getCompany()+" "+fb.getTicketPrice());
		//fb.addFlightBookingInformation();	
		//fb.displayFlightInformation();

		}

}

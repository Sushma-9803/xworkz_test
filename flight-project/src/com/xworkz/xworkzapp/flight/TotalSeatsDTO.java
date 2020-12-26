package com.xworkz.xworkzapp.flight;

public class TotalSeatsDTO {
	
	public  TotalSeatsDTO[] totalSeatsdto=new TotalSeatsDTO[2] ;
	public int index;
	
	public void FlightBooking(int size) {
		
	}
	
	public void addFlightBookingInformation()
	{
		if( totalSeatsdto !=null)
		{
			System.out.println( "adding information");
		}
		else if(totalSeatsdto ==null){
			System.out.println("information is not added");
		}
	}
	public void displayFlightInformation(TotalSeatsDTO  totalSeats)
	{
		for(int i=0; i<totalSeatsdto.length; i++) {
			if( totalSeatsdto !=null) {
				System.out.println(totalSeatsdto[i].getAirPlaneCode()+" "+totalSeatsdto[i].getTicketPrice()+" "+totalSeatsdto[i].getCompany());
			}
			else if(totalSeatsdto ==null) {
				System.out.println("display the information"); 
			}
		}
	}
	public void displayByAirPlaneCode(String AirPlaneCode) {
		for(int i=0; i<totalSeatsdto.length; i++) {
			if( totalSeatsdto !=null) {
				if(totalSeatsdto[i].getAirPlaneCode().equals(AirPlaneCode)) {
			System.out.println("flight is present by airplanecode");
			System.out.println(totalSeatsdto[i].getAirPlaneCode()+" "+totalSeatsdto[i].getTicketPrice()+" "+totalSeatsdto[i].getCompany());
		}
	}
			else {
				System.out.println("pla add details");
			}
	
	}
	}

	}
		
	
	
	



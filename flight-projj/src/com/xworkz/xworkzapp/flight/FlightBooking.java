package com.xworkz.xworkzapp.flight;

public class FlightBooking {
	private String AirPlaneCode;
	private double ticketPrice;
   private  	String company;

public FlightBooking()
{
	System.out.println("FlightBooking objex=ct is created");
}
	
	public String getAirPlaneCode() {
		return AirPlaneCode;
	}
	public void setAirPlaneCode(String airPlaneCode) {
		AirPlaneCode = airPlaneCode;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	

}

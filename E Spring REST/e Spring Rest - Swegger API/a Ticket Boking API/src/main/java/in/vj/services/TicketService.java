package in.vj.services;

import in.vj.model.Passenger;

public interface TicketService 
{
	 Passenger registerPassenger(Passenger passanger);
	 Passenger fetchThePassengerInfo(Integer id);
	 
	 
	 
}

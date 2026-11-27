package in.vj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.vj.model.Passenger;
import in.vj.model.Ticket;
import in.vj.services.TicketService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/book-ticket")
@Tag(name="TicketBookingAPI",description = "There are two api one will accept Passenger info and generate ticket number & Other will generate full Ticket infp based on ticket number..")
public class TicketController 
{
	@Autowired
	private TicketService service;
	
	
	@PostMapping("/get-ticketNumber")
	@Operation(summary = "POST Operation", description = "This api will accept Passenger info and Generate Ticket Number..")
	public ResponseEntity<Integer> registerPassenger(@RequestBody Passenger passenger)
	{
		Passenger pass= service.registerPassenger(passenger);
		Integer ticketNumer = pass.getPid();
		
		return new ResponseEntity<Integer>(ticketNumer,HttpStatus.CREATED);
	}
	

	@GetMapping("/get-ticket/{ticketNumber}")
	@Operation(summary = "GET Operation", description = "This api will accept Ticket Number info and Generate Full Ticket Number..")
	public ResponseEntity<Ticket> getTicket(@PathVariable("ticketNumber") Integer ticketNumber)
	{
		Passenger passenger= service.fetchThePassengerInfo(ticketNumber);
		Ticket ticket = new Ticket();
		ticket.setTicketNumber(passenger.getPid());
		ticket.setName(passenger.getName());
		ticket.setDeparture(passenger.getDeparture());
		ticket.setArrival(passenger.getArrival());
		ticket.setDateOfJourney(passenger.getDateOfJourney());
		ticket.setStatus("Confirm");
		ticket.setTicketPrice(545.2);
		
		return new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
	}
	
	
}

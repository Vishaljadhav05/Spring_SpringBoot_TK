package in.vj.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vj.model.Passenger;
import in.vj.repo.TicketRepo;

@Service
public class TicketServiceImpl implements TicketService
{

	@Autowired
	private TicketRepo repo;
	
	@Override
	public Passenger registerPassenger(Passenger passenger) {
		
		return repo.save(passenger);
	}

	@Override
	public Passenger fetchThePassengerInfo(Integer id) 
	{
		Optional<Passenger> op = repo.findById(id);
		
		return op.get();
	}

}

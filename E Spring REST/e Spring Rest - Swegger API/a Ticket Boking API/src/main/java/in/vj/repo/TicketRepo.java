package in.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import in.vj.model.Passenger;

 //@Repository // We can also add for readablity purpose
public interface TicketRepo extends JpaRepository<Passenger	, Integer>
{
	
}

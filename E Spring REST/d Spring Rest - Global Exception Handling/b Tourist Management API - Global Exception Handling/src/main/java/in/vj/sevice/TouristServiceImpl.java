package in.vj.sevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vj.dao.TouristRepo;
import in.vj.exception.TouristNotFoundException;
import in.vj.model.Tourist;

@Service
public class TouristServiceImpl implements TouristService
{
	@Autowired
	private TouristRepo repo;
	
	@Override
	public String registerTourist(Tourist tourist) 
	{
		Tourist tour = repo.save(tourist);
		return "Tourist info registered with id: "+tour.getId();
	}

	@Override
	public Tourist fetchTouristById(Integer id) throws TouristNotFoundException {
		// Optional<Tourist> optional = repo.findById(id);
//		
//		if(optional.isPresent())
//			return optional.get();
//		else
//			throw new TouristNotFoundException("Tourist with given id is not found !!!");
		
		return repo.findById(id).orElseThrow(()->new TouristNotFoundException("Tourist with given id is not found !!!"));
	}

	@Override
	public List<Tourist> fetchAllTouristInfo() {
		
		return repo.findAll();
	}

	@Override
	public String updateTheToursitInfo(Tourist tourist) throws TouristNotFoundException 
	{
		Optional<Tourist> optional = repo.findById(tourist.getId());
		
		if(optional.isPresent())
		{
			 repo.save(tourist);
			 return "Tourist info is Updated Successfully";
		}
		else
		{
			throw new TouristNotFoundException("Tourist with given id is not found for updation");
		}
		
	}

	@Override
	public String updateTheToursitBudget(Integer id, Double budget) 
	{
		Optional<Tourist> optional =  repo.findById(id);
		
		if(optional.isPresent())
		{
			Tourist tourist = optional.get();
			tourist.setBudget(budget);
			repo.save(tourist);
			return "Tourist info is Updated Successfully";
		}
		else
		{
			throw new TouristNotFoundException("Tourist with given id is not found for updation");
		}
	}

	@Override
	public String deleteTourist(Integer id) 
	{
		
		Optional<Tourist> op =  repo.findById(id);
		
	    if(op.isPresent())
	    {
	    	repo.deleteById(id);
	    	return "Tourist with id "+ id+" deleted";
	    }
	    else
		{
			throw new TouristNotFoundException("Tourist with given id is not found for Deletion");
		}
	}

}

package in.vj.sevice;

import java.util.List;

import in.vj.exception.TouristNotFoundException;
import in.vj.model.Tourist;

public interface TouristService 
{
	String registerTourist(Tourist tourist);
	
	Tourist fetchTouristById(Integer id) throws TouristNotFoundException;
	
	List<Tourist> fetchAllTouristInfo();
	
    String updateTheToursitInfo(Tourist tourist) throws TouristNotFoundException;
	
    String updateTheToursitBudget(Integer id, Double budget);
    
    String deleteTourist(Integer id);
}

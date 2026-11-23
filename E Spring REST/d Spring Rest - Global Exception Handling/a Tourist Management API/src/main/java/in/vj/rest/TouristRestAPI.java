package in.vj.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.vj.exception.TouristNotFoundException;
import in.vj.model.Tourist;
import in.vj.sevice.TouristService;

@RestController
public class TouristRestAPI 
{
	@Autowired
	private TouristService service;
	
	@PostMapping("/regTourist")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist toursit)
	{
		String response = service.registerTourist(toursit);
		return new ResponseEntity<String>(response,HttpStatus.CREATED) ;
	}
	
	@GetMapping("/getTourist/{id}")
	public ResponseEntity<?> getTourist(@PathVariable("id") Integer id)
	{
		try {
			Tourist tourist = service.fetchTouristById(id);
			return new ResponseEntity<Tourist>(tourist,HttpStatus.OK) ;
		} 
		catch (TouristNotFoundException e) 
		{
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST) ;
		}
		
	}
	
	
	
	@GetMapping("/getAllTourist")
	public ResponseEntity<?> getAllTourist()
	{
		try {
			List<Tourist> tourist = service.fetchAllTouristInfo();
			return new ResponseEntity<List>(tourist,HttpStatus.OK) ;
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<String>("Some problem in fetch",HttpStatus.INTERNAL_SERVER_ERROR) ;
		}
		
	}
	
	
	@PutMapping("/UpdateTourist")
	public ResponseEntity<String> updateTheTourist(@RequestBody Tourist tourist)
	{
		try 
		{
			String status = service.updateTheToursitInfo(tourist);
			return new ResponseEntity<String>(status,HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST) ;
		}
		
	}
	
	
	@PatchMapping("/UpdateTheTouristBudget/{id}/{budget}")  // Patch is used to update minimal infornation
	public ResponseEntity<String> updateTheTouristBudget(@PathVariable("id")Integer id,@PathVariable("budget") Double budget)
	{
		try 
		{
			String status = service.updateTheToursitBudget(id,budget);
			return new ResponseEntity<String>(status,HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST) ;
		}
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>deleteTourist(@PathVariable("id")Integer id)
	{
		try 
		{
			String status = service.deleteTourist(id);
			return new ResponseEntity<String>(status,HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST) ;
		}
		
	}
}

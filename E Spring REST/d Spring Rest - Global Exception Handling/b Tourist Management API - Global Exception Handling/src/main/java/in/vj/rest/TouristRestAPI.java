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
import in.vj.model.Tourist;
import in.vj.sevice.TouristService;

@RestController
public class TouristRestAPI {
	@Autowired
	private TouristService service;

	@PostMapping("/regTourist")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist toursit)
	{
		String response = service.registerTourist(toursit);
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}

	@GetMapping("/getTourist/{id}")
	public ResponseEntity<Tourist> getTourist(@PathVariable("id") Integer id) 
	{

		Tourist tourist = service.fetchTouristById(id);
		return new ResponseEntity<Tourist>(tourist, HttpStatus.OK);

	}

	@GetMapping("/getAllTourist")
	public ResponseEntity<List> getAllTourist() 
	{
		List<Tourist> tourist = service.fetchAllTouristInfo();
		return new ResponseEntity<List>(tourist, HttpStatus.OK);

	}

	@PutMapping("/UpdateTourist")
	public ResponseEntity<String> updateTheTourist(@RequestBody Tourist tourist) 
	{

		String status = service.updateTheToursitInfo(tourist);
		return new ResponseEntity<String>(status, HttpStatus.OK);

	}

	@PatchMapping("/UpdateTheTouristBudget/{id}/{budget}") // Patch is used to update minimal information  
	public ResponseEntity<String> updateTheTouristBudget(@PathVariable("id") Integer id,
			@PathVariable("budget") Double budget) 
	{

		String status = service.updateTheToursitBudget(id, budget);
		return new ResponseEntity<String>(status, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTourist(@PathVariable("id") Integer id) 
	{

		String status = service.deleteTourist(id);
		return new ResponseEntity<String>(status, HttpStatus.OK);

	}
}

package in.main;

import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.model.Alien;


// Java Object to Json

public class MainClass 
{
	public static void main(String[] args) throws JsonProcessingException {
		
		
		Alien alien1 = new Alien(1,"Vishal", "Mumbai");
		Alien alien2 = new Alien(2,"Ram", "Indore");
		Alien alien3 = new Alien(3,"Komal", "Pune");
		
		
		List<Alien> lst = Arrays.asList(alien1,alien2,alien3);
		
		System.out.println(alien1+"\n"+alien2+"\n"+alien3);
		
		// Create ObjectMapper
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(lst);
		
		System.out.println(json);
	}
}


// Output:-

/*

Alien [id=1, name=Vishal, city=Mumbai]
Alien [id=2, name=Ram, city=Indore]
Alien [id=3, name=Komal, city=Pune]
[ {
  "id" : 1,
  "name" : "Vishal",
  "city" : "Mumbai"
}, {
  "id" : 2,
  "name" : "Ram",
  "city" : "Indore"
}, {
  "id" : 3,
  "name" : "Komal",
  "city" : "Pune"
} ]

*/
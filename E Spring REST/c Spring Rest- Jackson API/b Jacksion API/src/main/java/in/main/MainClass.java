package in.main;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.model.Alien;


// Json to Java Object

public class MainClass 
{
	public static void main(String[] args) throws IOException {
		
		
		ObjectMapper mapper = new ObjectMapper();
		Alien obj = mapper.readValue(new File("json/Sample.json"), Alien.class);
		
		System.out.println(obj);
	}
}


// Output:-

/*  Annotation is used here in case of extra attribute

Alien [id=1, name=Vishal, city=Mumbai]

*/
package in.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
					title= "TicketBooking API",
					version = "v1.0",
					description = "This api will Book & generate ticket"
					),
		servers =@Server(
						url="http://localhost:8484/TB",
						description = "This api is deployed in the followed url"
						
						)
		
		
		)
public class EaTicketBokingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EaTicketBokingApiApplication.class, args);
	}

}


// How can we use swagger : search in browser

/*

http://localhost:8484/TB/swagger-ui/index.html



*/

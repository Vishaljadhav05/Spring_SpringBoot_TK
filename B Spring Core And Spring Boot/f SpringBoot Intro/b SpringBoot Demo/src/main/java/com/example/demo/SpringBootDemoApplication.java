package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.services.GreetingServices;

@SpringBootApplication
public class SpringBootDemoApplication 
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		
		GreetingServices greet = context.getBean(GreetingServices.class);
		
		String status = greet.generateGreeting("Uday ");
	    System.out.println(status);
		
	}

}

// Output:-


/*

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

[32m :: Spring Boot :: [39m              [2m (v4.1.1)[0;39m

[2m2026-09-02T15:45:05.329+05:30[0;39m [32m INFO[0;39m [35m8768[0;39m [2m--- [fb_SpringBoot_Demo] [           main] [0;39m[36mc.e.demo.SpringBootDemoApplication      [0;39m [2m:[0;39m Starting SpringBootDemoApplication using Java 21.0.12 with PID 8768 (E:\Telusku Eclipse Workspace\S Spring Core And Spring Boot\fb_SpringBoot_Demo\target\classes started by hp in E:\Telusku Eclipse Workspace\S Spring Core And Spring Boot\fb_SpringBoot_Demo)
[2m2026-09-02T15:45:05.332+05:30[0;39m [32m INFO[0;39m [35m8768[0;39m [2m--- [fb_SpringBoot_Demo] [           main] [0;39m[36mc.e.demo.SpringBootDemoApplication      [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
Config bean created
Greetings Bean Created ...
[2m2026-09-02T15:45:05.688+05:30[0;39m [32m INFO[0;39m [35m8768[0;39m [2m--- [fb_SpringBoot_Demo] [           main] [0;39m[36mc.e.demo.SpringBootDemoApplication      [0;39m [2m:[0;39m Started SpringBootDemoApplication in 0.658 seconds (process running for 0.904)
Good Afternoon! Uday 

*/

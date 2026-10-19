package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.Alien;
@SpringBootApplication
public class SpringBootDemoApplication 
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		
	    
		Alien alien = context.getBean(Alien.class);
		
		alien.disp();
		
	    context.close();
		
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

[2m2026-10-14T21:27:27.155+05:30[0;39m [32m INFO[0;39m [35m26652[0;39m [2m--- [fb_SpringBoot_Demo] [           main] [0;39m[36mc.e.demo.SpringBootDemoApplication      [0;39m [2m:[0;39m Starting SpringBootDemoApplication using Java 21.0.12 with PID 26652 (E:\Telusku Eclipse Workspace\S Spring Core And Spring Boot\ga_SpringBoot\target\classes started by hp in E:\Telusku Eclipse Workspace\S Spring Core And Spring Boot\ga_SpringBoot)
[2m2026-10-14T21:27:27.160+05:30[0;39m [32m INFO[0;39m [35m26652[0;39m [2m--- [fb_SpringBoot_Demo] [           main] [0;39m[36mc.e.demo.SpringBootDemoApplication      [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
Static black : Alien Bean
Java Instance Block Alien Bean
Alien Bean Created
Init method of Alien
[2m2026-10-14T21:27:27.948+05:30[0;39m [32m INFO[0;39m [35m26652[0;39m [2m--- [fb_SpringBoot_Demo] [           main] [0;39m[36mc.e.demo.SpringBootDemoApplication      [0;39m [2m:[0;39m Started SpringBootDemoApplication in 1.517 seconds (process running for 2.229)
Buisness logic of Alien Class ...
---> Bean Destryoed <--- 

*/

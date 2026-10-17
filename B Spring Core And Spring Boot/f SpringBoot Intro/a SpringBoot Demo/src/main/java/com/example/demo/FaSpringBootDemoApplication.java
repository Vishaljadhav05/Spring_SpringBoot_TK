package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FaSpringBootDemoApplication {

	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(FaSpringBootDemoApplication.class, args);
		
		
		Developer obj = context.getBean(Developer.class);
		obj.devTask();
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

[2m2026-09-02T12:07:34.917+05:30[0;39m [32m INFO[0;39m [35m21132[0;39m [2m--- [fa_SpringBoot_Demo] [           main] [0;39m[36mc.e.demo.FaSpringBootDemoApplication    [0;39m [2m:[0;39m Starting FaSpringBootDemoApplication using Java 21.0.12 with PID 21132 (E:\Telusku Eclipse Workspace\S Spring Core And Spring Boot\fa_SpringBoot_Demo\target\classes started by hp in E:\Telusku Eclipse Workspace\S Spring Core And Spring Boot\fa_SpringBoot_Demo)
[2m2026-09-02T12:07:34.924+05:30[0;39m [32m INFO[0;39m [35m21132[0;39m [2m--- [fa_SpringBoot_Demo] [           main] [0;39m[36mc.e.demo.FaSpringBootDemoApplication    [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
Developer bean created...
[2m2026-09-02T12:07:35.675+05:30[0;39m [32m INFO[0;39m [35m21132[0;39m [2m--- [fa_SpringBoot_Demo] [           main] [0;39m[36mc.e.demo.FaSpringBootDemoApplication    [0;39m [2m:[0;39m Started FaSpringBootDemoApplication in 1.446 seconds (process running for 1.989)
>>> Devleoped a Beautiful application <<<

*/
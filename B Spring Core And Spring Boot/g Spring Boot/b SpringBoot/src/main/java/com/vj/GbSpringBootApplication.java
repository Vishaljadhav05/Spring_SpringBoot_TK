package com.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vj.service.Amazon;

@SpringBootApplication
public class GbSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(GbSpringBootApplication.class, args);
		
		
		int count = container.getBeanDefinitionCount();
		System.out.println(count);// 52+3
		
		System.out.println("................................");
		String[] beanNames =container.getBeanDefinitionNames();
		System.out.println("Bean Definations are as follows :-->");
		for (String names : beanNames) {
			System.out.println(names);
		}
		
		System.out.println("................................");
		
		Amazon amz = container.getBean(Amazon.class);
		
		Boolean status = amz.deliverTheProduct(4536.08);
		if(status)
			System.out.println("Delivery Success ");
		else
			System.out.println("Failed to deliver the product !!!");
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

[2m2026-10-14T22:18:17.120+05:30[0;39m [32m INFO[0;39m [35m30132[0;39m [2m--- [gb_SpringBoot] [           main] [0;39m[36mcom.vj.GbSpringBootApplication          [0;39m [2m:[0;39m Starting GbSpringBootApplication using Java 21.0.12 with PID 30132 (E:\Telusku Eclipse Workspace\S Spring Core And Spring Boot\gb_SpringBoot\target\classes started by hp in E:\Telusku Eclipse Workspace\S Spring Core And Spring Boot\gb_SpringBoot)
[2m2026-10-14T22:18:17.125+05:30[0;39m [32m INFO[0;39m [35m30132[0;39m [2m--- [gb_SpringBoot] [           main] [0;39m[36mcom.vj.GbSpringBootApplication          [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
FedEx Bean Created >>>
Amazon Bean created >>>
[2m2026-10-14T22:18:17.963+05:30[0;39m [32m INFO[0;39m [35m30132[0;39m [2m--- [gb_SpringBoot] [           main] [0;39m[36mcom.vj.GbSpringBootApplication          [0;39m [2m:[0;39m Started GbSpringBootApplication in 1.601 seconds (process running for 2.328)
Product with FedEx and Amount paid is :4536.08
Delivery Success 
 
 
---------------------------------------------------------------
 
 
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

[32m :: Spring Boot :: [39m              [2m (v4.1.1)[0;39m

[2m2026-10-14T22:39:42.396+05:30[0;39m [32m INFO[0;39m [35m20800[0;39m [2m--- [gb_SpringBoot] [           main] [0;39m[36mcom.vj.GbSpringBootApplication          [0;39m [2m:[0;39m Starting GbSpringBootApplication using Java 21.0.12 with PID 20800 (E:\Telusku Eclipse Workspace\S Spring Core And Spring Boot\gb_SpringBoot\target\classes started by hp in E:\Telusku Eclipse Workspace\S Spring Core And Spring Boot\gb_SpringBoot)
[2m2026-10-14T22:39:42.399+05:30[0;39m [32m INFO[0;39m [35m20800[0;39m [2m--- [gb_SpringBoot] [           main] [0;39m[36mcom.vj.GbSpringBootApplication          [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
FirstFlight Bean Created >>>
Amazon Bean created >>>
FedEx Bean Created >>>
[2m2026-10-14T22:39:42.787+05:30[0;39m [32m INFO[0;39m [35m20800[0;39m [2m--- [gb_SpringBoot] [           main] [0;39m[36mcom.vj.GbSpringBootApplication          [0;39m [2m:[0;39m Started GbSpringBootApplication in 0.748 seconds (process running for 1.041)
60
................................
Bean Definations are as follows :-->
org.springframework.context.annotation.internalConfigurationAnnotationProcessor
org.springframework.context.annotation.internalAutowiredAnnotationProcessor
org.springframework.context.annotation.internalCommonAnnotationProcessor
org.springframework.context.event.internalEventListenerProcessor
org.springframework.context.event.internalEventListenerFactory
gbSpringBootApplication
org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory
amazon
fedEx
firstFlight
org.springframework.boot.autoconfigure.AutoConfigurationPackages
org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration
propertySourcesPlaceholderConfigurer
org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration
mbeanExporter
objectNamingStrategy
mbeanServer
org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor
org.springframework.boot.context.internalConfigurationPropertiesBinder
org.springframework.boot.context.properties.BoundConfigurationProperties
org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter
spring.jmx-org.springframework.boot.autoconfigure.jmx.JmxProperties
org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration
springApplicationAdminRegistrar
org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration
forceAutoProxyCreatorToUseClassProxying
org.springframework.boot.autoconfigure.aop.AopAutoConfiguration
org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration
applicationAvailability
org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration
org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration
lifecycleProcessor
spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties
org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration
spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties
org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration
fileWatcher
sslPropertiesSslBundleRegistrar
sslBundleRegistry
spring.ssl-org.springframework.boot.autoconfigure.ssl.SslProperties
org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$ThreadPoolTaskExecutorBuilderConfiguration
threadPoolTaskExecutorBuilder
org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$SimpleAsyncTaskExecutorBuilderConfiguration
simpleAsyncTaskExecutorBuilder
org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$AsyncConfigurerConfiguration
applicationTaskExecutorAsyncConfigurer
org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$TaskExecutorConfiguration
applicationTaskExecutor
org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$BootstrapExecutorConfiguration
bootstrapExecutorAliasPostProcessor
org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration
spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties
org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$ThreadPoolTaskSchedulerBuilderConfiguration
threadPoolTaskSchedulerBuilder
org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$SimpleAsyncTaskSchedulerBuilderConfiguration
simpleAsyncTaskSchedulerBuilder
org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration
spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties
org.springframework.aop.config.internalAutoProxyCreator
org.springframework.aop.framework.autoproxy.defaultProxyConfig
................................
Product with FirstFlight and Amount paid is :4536.08
Delivery Success 


*/
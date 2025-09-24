	package com.demo.Application;
	
import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
	   
	@SpringBootApplication
	public class Application {
	
		public static void main(String[] args) {
			ApplicationContext context=SpringApplication.run(Application.class, args);  //creates  spring IOC container inside JVM
                                                                                        //and loads beans into context			
			Alien obj=context.getBean(Alien.class);  //dependency injections
			obj.build();
		
		}
	
	}

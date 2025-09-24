package com.demo.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   //component annotation tells to spring this is the managed bean so that the bean is created in the ioc container once we ran the main methods 
public class Dev {  
	
	@Autowired
	private Laptop comp;  //injecting object in field injection


  public void build()
  {
	  comp.code();
	  System.out.println("Building Project.....");
  }
}

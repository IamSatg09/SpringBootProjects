package com.demo.Application;

import org.springframework.stereotype.Component;

@Component   //component annotation tells to spring this is the managed bean so that the bean is created in the ioc container once we ran the main methods 
public class Alien {  

  public void build()
  {
	  System.out.println("Building Project.....");
  }
}

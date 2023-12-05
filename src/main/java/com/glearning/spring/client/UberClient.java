package com.glearning.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.glearning.spring.Passenger;

public class UberClient {
	
	public static void main(String[] args) {
		/*
		 * UberGo driver = new UberGo(); Passenger ravi = new Passenger(driver);
		 * 
		 * UberPrime primeDriver = new UberPrime(); ravi.setUberDriver(primeDriver);
		 * 
		 * ravi.commute("BTM", "Marathalli");
		 */
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Passenger passenger = applicationContext.getBean("passenger", Passenger.class);
		//Passenger passenger2 = applicationContext.getBean("passenger", Passenger.class);
		
		//System.out.println("Are the passenger1 and passenger2 pointing to the same reference : " + (passenger1 == passenger2));
		passenger.commute("Banashankari", "HAL-Indiranagar");
		
		AbstractApplicationContext context = (AbstractApplicationContext)applicationContext;
		context.close();
	}

	
}

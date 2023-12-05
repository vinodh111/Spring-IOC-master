package com.glearning.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Passenger {
	
	private UberTravel uberDriver;
	
	//constructor dependency injection
	public Passenger(UberTravel uberDriver) {
		this.uberDriver =uberDriver;
	}
	
	public UberTravel getUberDriver() {
		return uberDriver;
	}

	//property/setter based dependency injection
	public void setUberDriver(UberTravel uberDriver) {
		this.uberDriver = uberDriver;
	}

	public void commute(String from, String to) {
		this.uberDriver.trip(from, to);
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("After the passenger bean is initialized");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Before the passenger bean is destruction");
	}

}

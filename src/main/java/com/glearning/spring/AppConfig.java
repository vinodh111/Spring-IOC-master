package com.glearning.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class AppConfig {
	
	//@Bean
	public Passenger passenger() {
		return new Passenger(uberTravel());
	}
	
	//@Bean
	public UberTravel uberTravel() {
		return new UberGo();
	}

}

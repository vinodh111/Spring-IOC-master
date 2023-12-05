package com.glearning.spring;

import org.springframework.stereotype.Component;

@Component
public class UberPrime implements UberTravel{
	
	public void trip(String from, String to) {
		System.out.println("Travelling from "+from +" to "+ to +" using UberPrime");
		
	}

}

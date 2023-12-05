package com.glearning.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UberGo implements UberTravel{
	
	public void trip(String from, String to) {
		System.out.println("Travelling from "+from +" to "+ to +" using UberGo");
	}

}

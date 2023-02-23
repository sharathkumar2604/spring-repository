package com.xworkz.springFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	
	@Autowired
	public Keyboard keyboard;
	public void turnOn() {
		
		System.out.println("laptop turn on");
		keyboard.type();
	}

}

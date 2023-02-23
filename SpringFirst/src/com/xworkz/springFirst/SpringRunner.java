package com.xworkz.springFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRunner {

	public static void main(String[] args) {

		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Laptop lp=context.getBean(Laptop.class);
		lp.turnOn();
		Keyboard board =context.getBean(Keyboard.class);
		//board.type();
		
		
		
	}

}

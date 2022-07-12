package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {

	public void on() {
		System.out.println("Car Start");
	}
	
	public void off() {
		System.out.println("Car Stop");
	}
}

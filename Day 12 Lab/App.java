package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.Calculator;
import com.cdac.component.Car;
import com.cdac.component.CurrencyConverter;
import com.cdac.component.HelloWorld;
import com.cdac.component.LoginService;

public class App {

	public static void main(String[] args) {
	//Loading Spring/IOC Container object needed of ApplicationContext
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		//Accessing a particular bean(Object)
		HelloWorld hw = (HelloWorld) ctx.getBean("hello");
		
		System.out.println(hw.sayHello("Yogesh"));
		
		Calculator c = (Calculator) ctx.getBean("calc");
		System.out.println(c.add(30, 20));
		System.out.println(c.sub(30, 20));
		
		CurrencyConverter cc = (CurrencyConverter) ctx.getBean("currencyConv");
		System.out.println(cc.convert("USD", "INR", 10));
		System.out.println(cc.convert("GBP", "INR", 10));
		
		LoginService ls = (LoginService) ctx.getBean("loginServ");
		System.out.println(ls.isValidUser("yogesh", "123"));
		System.out.println(ls.isValidUser("hitesh", "456"));
		
		Car cr = (Car) ctx.getBean("car");
		cr.drive();
		
}

}

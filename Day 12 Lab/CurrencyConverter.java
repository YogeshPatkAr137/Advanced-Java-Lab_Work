package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("currencyConv") //Pass id in (" ")
public class CurrencyConverter {

	public double convert(String from, String to, double amount) {
		
		if(from.equals("USD")&& to.equals("INR"))
			return 78.95 * amount;
		else if(from.equals("GBP")&& to.equals("INR"))
			return 91.56 * amount;
		else
			return 0;
	}
}

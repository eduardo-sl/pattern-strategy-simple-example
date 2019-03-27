package com.example.transport.service;

public class Fare {

	private TransportType type;

	public Fare(TransportType type) {
		this.type = type;
	}
	
	public double calculate(int distance) {
		double price = 0;
		if (TransportType.TAXI.equals(type)) {
			price = distance * 1.85 + 14;
		} else if (TransportType.UBER.equals(type)) {
			price = distance * 1.25 + 8;
		}
		return price;
	}

}

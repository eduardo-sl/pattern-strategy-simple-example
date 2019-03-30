package com.example.transport.service.fare;

import com.example.transport.service.Fare;

public class Taxi implements Fare {

	@Override
	public double calculate(int distance) {
		return distance * 1.85 + 14;
	}
}

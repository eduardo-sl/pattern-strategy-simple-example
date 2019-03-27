package com.example.transport.service;

import com.example.transport.service.fare.Pop;
import com.example.transport.service.fare.Taxi;
import com.example.transport.service.fare.Uber;

public enum TransportFareType {

	TAXI {
		@Override
		public Fare create() {
			return new Taxi();
		}
	},
	UBER {
		@Override
		public Fare create() {
			return new Uber();
		}
	},
	POP {
		@Override
		public Fare create() {
			return new Pop();
		}
	};

	public abstract Fare create();
}
package com.example.transport;

import java.util.Scanner;

import com.example.transport.service.Fare;
import com.example.transport.service.TransportFareType;

public class Main {
	
	public static void main(String[] args) {
		try (Scanner data = new Scanner(System.in)) {
			System.out.print("Informe a distância: ");
			int distance = data.nextInt();
			System.out.print("Qual o tipo de transporte (1) Taxi, (2) Uber, (3) Pop: ");
			int transportCode = data.nextInt();
			TransportFareType transportType = TransportFareType.values()[transportCode - 1];
			
			Fare fare = transportType.create();
			double preco = fare.calculate(distance);
			System.out.printf("O valor total é de R$%.2f", preco);
		}
	}
}

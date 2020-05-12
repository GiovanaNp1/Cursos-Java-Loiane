package com.giovana.exercios.aula25;

public class Carro {
	
		String marca;
		String modelo;
		int numPassageiro;
		double capCombustivel;
		double consumoCombustivel;
		
		void exibirAutonomia(){
			System.out.println("a autonomia do carro é de: " + capCombustivel * consumoCombustivel + " km");
		}
}

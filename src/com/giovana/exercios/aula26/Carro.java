package com.giovana.exercios.aula26;

public class Carro {
	
		String marca;
		String modelo;
		int numPassageiro;
		double capCombustivel;
		double consumoCombustivel;
		
		void exibirAutonomia(){
			System.out.println("a autonomia do carro é de: " + capCombustivel * consumoCombustivel + " km");
		}
		double obterAutonomia(){
			System.out.println("Metodo obterAutonomia foi chamado");
			return capCombustivel * consumoCombustivel;
		}
}

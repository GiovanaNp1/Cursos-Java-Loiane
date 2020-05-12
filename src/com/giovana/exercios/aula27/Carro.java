package com.giovana.exercios.aula27;

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
	
	double calcularCombustivel(double km) {
		double qtdCaombustivel =  km/consumoCombustivel;
		return qtdCaombustivel;
	}
}

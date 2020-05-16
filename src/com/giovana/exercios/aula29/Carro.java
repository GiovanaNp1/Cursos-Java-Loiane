package com.giovana.exercios.aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro(){
		numPassageiro = 4;
		System.out.println("A instancia carro foi chamada");
	}
	
	Carro(String marca_, String modelo_, int numPassageiro_, double capCombustivel_,  double consumoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiro = numPassageiro_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}
	
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

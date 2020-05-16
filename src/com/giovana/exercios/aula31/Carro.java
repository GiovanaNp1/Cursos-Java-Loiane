package com.giovana.exercios.aula31;

public class Carro {
	public String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	private double consumoCombustivel;
	
	public void exibirAutonomia(){
		System.out.println("a autonomia do carro é de: " + capCombustivel * consumoCombustivel + " km");
	}
	public double obterAutonomia(){
		System.out.println("Metodo obterAutonomia foi chamado");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKMPorConsumoDeCombustivel(double km) {
		return km/consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		return divideKMPorConsumoDeCombustivel(km);
	}
}

package com.giovana.exercios.aula30;

public class Carro {
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro(String marca, String modelo, int numPassageiro, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiro = numPassageiro;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public Carro(String marca, String modelo, int numPassageiro) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiro = numPassageiro;
		
		System.out.println("Chamando construtor com 3 parametros");
	}

	public Carro(String marca, String modelo) {
		this("Fiat", "Ducato", 10);
		System.out.println("Chamando construtor com 2 parametros");
	}

	public Carro() { }
	
	
	void exibirAutonomia(){
		System.out.println("a autonomia do carro é de: " + capCombustivel * consumoCombustivel + " km");
	}
	double obterAutonomia(){
		System.out.println("Metodo obterAutonomia foi chamado");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCaombustivel =  km/consumoCombustivel;
		return qtdCaombustivel;
	}
}

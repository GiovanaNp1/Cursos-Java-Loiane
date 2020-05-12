package com.giovana.exercios.aula26;

import com.giovana.exercios.aula26.Carro;

public class TesteCarro {
	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiro);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + van.obterAutonomia());
		
//		Carro fusca = new Carro();
//		fusca.marca = "Volkswagen";
//		fusca.modelo = "Fusca";
//		fusca.numPassageiro = 4;
//		fusca.capCombustivel = 100;
//		fusca.consumoCombustivel = 0.2;
//		
//		System.out.println(fusca.marca);
//		System.out.println(fusca.modelo);
//		System.out.println(fusca.numPassageiro);
	}
}

package com.giovana.exercios.aula34;

public class Contador {
	private static int cont;
	
	public static void incrementarNumero() {
		cont++;
	}
	public static void zerarNumero() {
		cont = 0;
	}
	public static int retornarNumero(){
		return cont;
	}
}

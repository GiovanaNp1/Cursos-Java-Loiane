package com.giovana.exercios.aula34;

public class Exercicio2Calculadora {
	public static void main(String[] args) {
		System.out.println(Calculadora2.somar(2,3));
		System.out.println(Calculadora2.subtrair(2,3));
		System.out.println(Calculadora2.multiplicar(2,3));
		System.out.println(Calculadora2.dividir(6,3));
		System.out.println(Calculadora2.potencia(2,3));
		
		System.out.println(Calculadora2.somar(2.5,3.5));
		System.out.println(Calculadora2.subtrair(2.5,3.5));
		System.out.println(Calculadora2.multiplicar(2.5,3.5));
		System.out.println(Calculadora2.dividir(5,2.5));
		
		imprimirValor(Calculadora2.somar(2, 5));
		imprimirValor(Calculadora2.subtrair(2, 5));
		imprimirValor(Calculadora2.dividir(5, 2));
		imprimirValor(Calculadora2.multiplicar(2, 5));
		
		imprimirValor(Calculadora2.somar(2.5, 5.5));
		imprimirValor(Calculadora2.subtrair(2.5, 5.5));
	}
	
	static void imprimirValor(int num) {
		System.out.println("\n Numeros: " + num);
	}
	
	static void imprimirValor(double num) {
		System.out.println("\n Numeros: " + num);
	}
}

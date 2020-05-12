package com.giovana.exercios.aula17;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		numeros.useLocale(Locale.ENGLISH);
		double paisA, paisB, taxaA, taxaB;
		int anos;
		
		System.out.println("Insira aqui o numero da população A");
		System.out.println("População A");
		paisA = numeros.nextDouble();
		while(paisA <= 0) {
		System.out.println("Por favor insira um numero de população maior que 0");
			paisA = numeros.nextDouble();
		}
		
		System.out.println("Insira aqui a taxa de crescimente de população no pais A");
		System.out.println("Taxa de crescimento do pais A");
		taxaA = numeros.nextDouble();
		while(taxaA <= 0) {
		System.out.println("Por favor insira um numero de taxa maior que 0");
			taxaA = numeros.nextDouble();
		}
		
		System.out.println("Insira aqui o numero da população B");
		System.out.println("População B");
		paisB = numeros.nextDouble();
		while(paisB <= 0) {
		System.out.println("Por favor insira um numero de população maior que 0");
			paisB = numeros.nextDouble();
		}
		
		System.out.println("Insira aqui a taxa de crescimente de população no pais B");
		System.out.println("Taxa de crescimento do pais B");
		taxaB = numeros.nextDouble();
		while(taxaB <= 0) {
		System.out.println("Por favor insira um numero de taxa maior que 0");
			taxaB = numeros.nextDouble();
		}
		
		anos = 0;
		
		while(paisA < paisB) {
			paisA += (paisA /100) * taxaA;
			paisB += (paisB/100) * taxaB;
			anos++;
		}
		System.out.println("O Pais A vai passar o pais B depois de " + anos + " anos");

	}

}

package com.giovana.exercios.aula17;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Faça um programa que leia 5 números e informe a soma e a média dos números.
		Scanner numeros = new Scanner(System.in);
		int numero, soma, media;
		soma = 0;
		System.out.println("Insara aqui 5 numeros");
		for(int i = 1; i <= 5; i++) {
			numero = numeros.nextInt();
			soma += numero;
		}
		media = soma / 5;
		System.out.println("A soma dos numeros é " + soma);
		System.out.println("A media dos numeros é " + media);
		
	}
}

package com.giovana.exercios.aula17;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um numero entre 0 e 10");
		numero = numeros.nextInt();
		
		while(numero < 0 || numero > 10) {
			System.out.println("Digite um numero entre 0 e 10");
			numero = numeros.nextInt();
		}
		System.out.println("O numero digitado foi: " + numero);
	}

}

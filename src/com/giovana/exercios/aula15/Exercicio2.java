package com.giovana.exercios.aula15;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite aqui um numero para saber se ele é positivo ou negativo");
		numero = numeros.nextInt();
		
		if(numero >= 0 ) {
			System.out.println("O numero é Positivo");
		}else {
			System.out.println("O numero é Negativo");
		}


	}

}

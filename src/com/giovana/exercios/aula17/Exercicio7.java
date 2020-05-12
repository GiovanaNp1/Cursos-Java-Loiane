package com.giovana.exercios.aula17;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		int numero, maior;
		
		maior = Integer.MIN_VALUE;
		
		System.out.println("Insara aqui 5 numeros");
		for(int i = 1; i <= 5; i++) {
			numero = numeros.nextInt();
			if(numero > maior) {
				maior = numero;
			}
		}
		System.out.println("O numero " + maior + " e o maior de todos" );
	}

}

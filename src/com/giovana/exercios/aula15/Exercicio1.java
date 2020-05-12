package com.giovana.exercios.aula15;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner numeros =  new Scanner(System.in);
		
		int numero1, numero2;
		System.out.println("Vamos descobrir qual dos numeros é o maior");
		System.out.println("Digite o primeiro numero: ");
		numero1 = numeros.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2=  numeros.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O numero "  + numero1 + " é o maior" );
		}else {
			System.out.println("O numero "  + numero2 + " é o maior" );
		}
	}

}

package com.giovana.exercios.aula17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		
		int  numero1, numero2;
		System.out.println("Digite um numero");
		numero1 = numeros.nextInt();
		System.out.println("Agora Digite outro numero");
		numero2 = numeros.nextInt();
		
		for(int i = numero1 ; i <= numero2; i++) {
			System.out.println(i);
		}
		for(int i = numero2 ; i <= numero1; i++) {
			System.out.println(i);
		}
	}

}

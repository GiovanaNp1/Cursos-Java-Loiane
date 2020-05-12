package com.giovana.exercios.aula15;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// FaçaumProgramaqueleiatrêsnúmerosemostreomaiordeles.
		Scanner numeros= new Scanner(System.in);
		
		int numero1, numero2, numero3;
		System.out.println("Escreva aqui em baixo 3 numeros para ver qual deles é o maior:");
		System.out.println("Numero 1: ");
		numero1 = numeros.nextInt();
		System.out.println("Numero 2: ");
		numero2 =  numeros.nextInt();
		System.out.println("Numero 3: ");
		numero3 =  numeros.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3 ) {
			System.out.println("o Numero 1 é maior " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("o Numero 2 é maior " + numero2);
		}else {
			System.out.println("o Numero 3 é maior " + numero3);
		}

	}

}

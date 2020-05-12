package com.giovana.exercios.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		numeros.useLocale(Locale.ENGLISH);
		
		int numero1, numero2, resultado1;
		double numero3, resultado2, resultado3;
		
		System.out.println("Digite aqui dois numeros inteiros e um numero real:");
		System.out.println("Primeiro numero inteiro:");
		numero1 = numeros.nextInt();
		System.out.println("Segundo numero inteiro:");
		numero2 = numeros.nextInt();
		System.out.println("Numero real:");
		numero3 = numeros.nextDouble();
	
		resultado1 = (numero1 * 2) + (numero2 / 2);
		resultado2 = (numero1 * 3) + numero3;
		resultado3 = Math.pow(numero3, 3);
		
		System.out.println("Os resultados foram:");
		System.out.println("a. o produto do dobro do primeiro com metade do segundo: " + resultado1);
		System.out.println("b. a soma do triplo do primeiro com o terceiro: " + resultado2);
		System.out.println("c. o terceiro elevado ao cubo: " + resultado3);

	}

}

package com.giovana.exercios.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner dinheiro = new Scanner(System.in);
		dinheiro.useLocale(Locale.ENGLISH);
		
		double preco1, preco2, preco3;
		System.out.println("Digite aqui o preço dos produtos para qual deles você deve comprar:");
		System.out.println("Primeiro Produto:");
		preco1 = dinheiro.nextDouble();
		System.out.println("Segundo Produto:");
		preco2 = dinheiro.nextDouble();
		System.out.println("Terceiro Produto:");
		preco3 = dinheiro.nextDouble();
		
		if(preco1 < preco2 && preco1 < preco3) {
			System.out.println("O primeiro produto com o preço de " + preco1 + " é a melhor opção" );
		}else if(preco2 < preco1 && preco2 < preco3) {
			System.out.println("O segundo produto com o preço de " + preco2 + " é a melhor opção" );
		}else {
			System.out.println("O terceiro produto com o preço de " + preco3 + " é a melhor opção" );
		}
		
	}

}

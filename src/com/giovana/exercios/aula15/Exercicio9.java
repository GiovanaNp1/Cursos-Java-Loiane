package com.giovana.exercios.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre-os em ordem
		// decrescente.
		Scanner dinheiro = new Scanner(System.in);
		dinheiro.useLocale(Locale.ENGLISH);
		
		double preco1, preco2, preco3;
		System.out.println("Digite aqui o preço dos produto:");
		System.out.println("Primeiro Produto:");
		preco1 = dinheiro.nextDouble();
		System.out.println("Segundo Produto:");
		preco2 = dinheiro.nextDouble();
		System.out.println("Terceiro Produto:");
		preco3 = dinheiro.nextDouble();
		
		if(preco1 > preco2 && preco1 > preco3) {
			System.out.println("O primeiro produto: " + preco1);
			if(preco2 > preco3) {
				System.out.println("O segundo produto: " + preco2);
				System.out.println("O terceiro produto: " + preco3);
				
			}else {
				System.out.println("O terceiro produto: " + preco3);
				System.out.println("O segundo produto: " + preco2);
			}
		}else if(preco2 > preco1 && preco2 > preco3) {
			System.out.println("O segundo produto: " + preco2);
			if(preco1 > preco3) {
				System.out.println("O primeiro produto: " + preco1);
				System.out.println("O terceiro produto: " + preco3);
				
			}else {
				System.out.println("O terceiro produto: " + preco3);
				System.out.println("O primeiro produto: " + preco1);
			}
		}else {
			System.out.println("O terceiro produto: " + preco3);
			if(preco1 > preco2) {
				System.out.println("O primeiro produto:  " + preco1);
				System.out.println("O segundo produto: " + preco2);
				
			}else {
				System.out.println("O segundo produto:" + preco2);
				System.out.println("O primeiro produto: " + preco1);
			}
		}
	}

}

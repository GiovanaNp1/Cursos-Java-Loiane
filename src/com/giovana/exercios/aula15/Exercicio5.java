package com.giovana.exercios.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner notas =  new Scanner(System.in);
		notas.useLocale(Locale.ENGLISH);
		
		double nota1, nota2, media;
		System.out.println("Vamos descobrir a sua media, Digite suas notas: ");
		System.out.println("Nota1: ");
		nota1 = notas.nextDouble();
		System.out.println("Nota2: ");
		nota2 = notas.nextDouble();
		
		media =  ( nota1 + nota2 ) / 2;
		if(media >= 7) {
			System.out.println("Aprovado");
		} else if (media < 7) {
			System.out.println("Reprovado");
		} else if (media == 10){
			System.out.println("Aprovado com Distinção");
		}else {
			System.out.println("Nota invalida");
		}
	}

}

package com.giovana.exercios.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) { 
		
		Scanner numeros = new Scanner(System.in);
		numeros.useLocale(Locale.ENGLISH);
		
		double nota1, nota2, media;
		String conceito;
		System.out.println("Vamos verificar sua media e se você foi aprovado ou reprovado");
		System.out.println("Digite suas notas:");
		System.out.println("Primeira nota:");
		nota1 = numeros.nextDouble();
		System.out.println("Segunda nota:");
		nota2 = numeros.nextDouble();
		
		media = (nota1 + nota2) / 2;
		if(media <= 10.0 && media > 9.0) {
			conceito = "A";
		}else if(media <= 9.0 && media > 7.5) {
			conceito = "B";
		}else if(media <= 7.5 && media >= 6.0) {
			conceito = "C";
		}else if(media <= 6.0 && media >= 4.0) {
			conceito = "D";
		}else {
			conceito = "E";
		}
		
		System.out.println("Primeira Nota: " + nota1);
		System.out.println("Segunda Nota: " + nota2);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + conceito);
		
		if(conceito == "A" || conceito == "B" || conceito=="C") {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		

	}

}

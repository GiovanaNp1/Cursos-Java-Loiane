package com.giovana.exercios.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
		Scanner notas =  new Scanner(System.in);
		notas.useLocale(Locale.ENGLISH);
		
		System.out.println("Veja a sua media, insira aqui suas notas no semestre");
		System.out.println("Primeira nota:");
		nota1 =  notas.nextDouble();
		System.out.println("Segunda nota:");
		nota2 =  notas.nextDouble();
		System.out.println("Terceira nota:");
		nota3 =  notas.nextDouble();
		System.out.println("Quarta nota:");
		nota4 =  notas.nextDouble();
		
		media = (nota1 + nota2 + nota3 +  nota4) / 4;
		System.out.println("A sua media é " + media);
		
	}
	
}

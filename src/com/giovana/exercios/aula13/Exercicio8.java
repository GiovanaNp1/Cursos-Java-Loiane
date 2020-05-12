package com.giovana.exercios.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
		
		int horas;
		double dinheroHora, dinheiroMes;
		
		System.out.println("Digite aqui quanto você ganha por hora: ");
		dinheroHora = scan.nextDouble();
		System.out.println("Agora digite quantas horas você trabalha por mês: ");
		horas = scan.nextInt();
		dinheiroMes = horas * dinheroHora;
		System.out.println("O seu dinheiro ganho no mês e de: " + dinheiroMes);
		
	}
}

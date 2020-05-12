package com.giovana.exercios.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner medida = new Scanner(System.in);
		medida.useLocale(Locale.ENGLISH);
		
		double altura, pesoIdeal;
		
		System.out.println("Digite a sua altura: ");
		altura = medida.nextDouble();
		pesoIdeal = (72.7 * altura) - 58;
		System.out.println("O peso ideal para sua altura é de: " +  pesoIdeal);
	}

}

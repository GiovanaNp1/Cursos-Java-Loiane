package com.giovana.exercios.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner temperatura = new Scanner(System.in);
		temperatura.useLocale(Locale.ENGLISH);
		
		int tempFarenheit, tempCelsius;
		
		System.out.println("Digite aqui a tesmperatura em graus Ferenheit: ");
		tempFarenheit = temperatura.nextInt();
		tempCelsius = 5 * (tempFarenheit - 32) / 9;
		System.out.println("A temperatura em graus Celsius é de: " +  tempCelsius);
	}

}

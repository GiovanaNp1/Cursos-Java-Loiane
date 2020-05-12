package com.giovana.exercios.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner temperatura = new Scanner(System.in);
		temperatura.useLocale(Locale.ENGLISH);
		
		double tempFarenheit, tempCelsius;
		
		System.out.println("Digite aqui a tesmperatura em graus Celsius: ");
		tempCelsius = temperatura.nextDouble();
		tempFarenheit = tempCelsius * 1.8 + 32;
		System.out.println("A temperatura em graus Ferenheit é de: " +  tempFarenheit);
		
	}

}

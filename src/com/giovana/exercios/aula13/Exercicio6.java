package com.giovana.exercios.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner medida = new Scanner(System.in);
		medida.useLocale(Locale.ENGLISH);
		
		double area, raio;
		
		System.out.println("Insira aqui o raio do circulo");
		raio  =  medida.nextDouble();
		area = Math.PI * Math.pow(raio, 2);
		System.out.println("A área do circulo é de: " +  area);
		
	}

}

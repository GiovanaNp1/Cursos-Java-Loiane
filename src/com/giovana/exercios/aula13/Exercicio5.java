package com.giovana.exercios.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner medidas = new Scanner (System.in);
		medidas.useLocale(Locale.ENGLISH);
		
		double metros, centimetros;
		
		System.out.println("Insira aqui os metros que deseja converter para centimetros: ");
		metros = medidas.nextDouble();
		centimetros = metros * 100;
		System.out.println(metros + "m é igual á " +  centimetros +  "cm");
	}

}

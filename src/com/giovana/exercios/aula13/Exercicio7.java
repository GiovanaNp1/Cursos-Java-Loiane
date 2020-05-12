package com.giovana.exercios.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner area = new Scanner (System.in);
		area.useLocale(Locale.ENGLISH);
		
		double medida, areaQuadrado;
		
		System.out.println("Digite aqui a largura do quadrado para ver o tamanho de sua area");
		medida = area.nextDouble();
		areaQuadrado = Math.pow(medida, 2);
		System.out.println("a area do quadrado é de: " + areaQuadrado);
		System.out.println("o dobro da area do quadrado é de: " + areaQuadrado * 2);
		
	}

}

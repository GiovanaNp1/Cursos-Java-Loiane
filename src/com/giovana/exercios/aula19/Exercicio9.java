package com.giovana.exercios.aula19;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio9 {
	public static void main(String[] args) {
		Random random = new Random();
		int vetorA[] = new int[10], vetorB[] = new int[10];
		double  vetorC[] = new double[10];
		for(int i = 0; i < vetorA.length ; i++) {
			vetorA[i] = random.nextInt(50);
			vetorB[i] = random.nextInt(50);
			vetorC[i] = vetorA[i] / vetorB[i];
			System.out.println("VetorA, indice: " + i + ", Numero: " + vetorA[i]);
		}
		System.out.println("");
		
		for(int i = 0; i < vetorB.length ; i++) {
			System.out.println("VetorB, indice: " + i + ", Numero: " + vetorB[i]);
		}
		
		System.out.println("");
		
		for(int i = 0; i < vetorC.length ; i++) {
			String formato = "###,##.##";
	        DecimalFormat d = new DecimalFormat(formato);
			System.out.println("VetorC, indice: " + i + ", Numero: " + d.format(vetorC[i]));
		}
	}
}

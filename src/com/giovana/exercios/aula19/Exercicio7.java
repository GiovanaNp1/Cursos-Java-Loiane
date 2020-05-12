package com.giovana.exercios.aula19;

import java.util.Random;

public class Exercicio7 {
	public static void main(String[] args) {
		Random random = new Random();
		int vetorA[] = new int[15], vetorB[] = new int[10], vetorC[] = new int[10];
		for(int i = 0; i < vetorA.length ; i++) {
			vetorA[i] = random.nextInt(50);
			vetorB[i] = random.nextInt(50);
			vetorC[i] = vetorA[i] - vetorB[i];
			
			System.out.println("VetorA, indice: " + i + ", Numero: " + vetorA[i]);
		}
		System.out.println("");
		
		for(int i = 0; i < vetorB.length ; i++) {
			System.out.println("VetorB, indice: " + i + ", Numero: " + vetorB[i]);
		}
		
		System.out.println("");
		
		for(int i = 0; i < vetorC.length ; i++) {
			System.out.println("VetorC, indice: " + i + ", Numero: " + vetorC[i]);
		}
	}
}

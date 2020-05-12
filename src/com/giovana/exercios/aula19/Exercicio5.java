package com.giovana.exercios.aula19;

import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {
		Random random = new Random();
		int vetorA[] = new int[10], vetorB[] = new int[10];
		for(int i = 0; i < vetorA.length ; i++) {
			vetorA[i] = random.nextInt(50);
			vetorB[i] = vetorA[i] * i;
			
			System.out.println("VetorA, indice: " + i + ", Numero: " + vetorA[i]);
		}
			System.out.println("");
		for(int i = 0; i < vetorB.length ; i++) {
			System.out.println("VetorB, indice: " + i + ", Numero: " + vetorB[i]);
		}
	}
}

package com.giovana.exercios.aula20;

import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		int[][] M = new int[4][4];
		int maior = 0;
		int[] casaMaior = new int[2];
		casaMaior[0] = 0;
		casaMaior[1] = 0;
		
		Random random = new Random();
		for(int i = 0; i < M.length ; i++) {
			for(int j = 0; j < M[i].length ; j++) {
				M[i][j] = random.nextInt(10);
				System.out.print(M[i][j] + "  ");
				if(M[i][j] > maior) {
					maior = M[i][j];
					casaMaior[0] = i + 1;
					casaMaior[1] = j + 1;
				}
			}
			System.out.println(" ");
		}
		System.out.println("O maior numero é: " + maior + " ,  que está localizado na casa da matriz de: Linha: " + casaMaior[0] +
				" , Coluna: " + casaMaior[1]);
	}
}

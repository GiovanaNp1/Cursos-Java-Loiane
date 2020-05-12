package com.giovana.exercios.aula20;

import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		int[][] M = new int[10][10];
		int[] casaMaior5 = new int[2];
		int[] casaMaior7 = new int[2];
		int[] casaMenor5 = new int[2];
		int[] casaMenor7 = new int[2];
		int maior5 = 0, maior7 = 0, menor5 = 11, menor7 = 11;
		
		
		Random random = new Random();
		for(int i = 0; i < M.length ; i++) {
			for(int j = 0; j < M[i].length ; j++) {
				M[i][j] = random.nextInt(10);
				System.out.print(M[i][j] + "  ");
				
				if(M[4][j] > maior5) {
					maior5 = M[4][j];
					casaMaior5[0] = j + 1;
				}else if(M[4][j] < menor5 && M[4][j] != 0) {
					menor5 = M[4][j];
					casaMenor5[1] = j + 1;
				}
				
				if(M[i][6] > maior7) {
					maior7 = M[i][6];
					casaMaior7[0] = i + 1;
				}else if(M[i][6] < menor7 && M[4][j] != 0) {
					menor7 = M[i][6];
					casaMenor7[1] = i;
				}
			}
			System.out.println(" ");
		} 
		System.out.println(" ");
		System.out.println("O maior numero da Linha 5 é: " + maior5 + " ,  que está localizado na Coluna: " + casaMaior5[0]);
		System.out.println("O menor numero da Linha 5 é: " + menor5 + " ,  que está localizado na Coluna: " + casaMenor5[1]);
		System.out.println("O maior numero da Coluna 7 é: " + maior7 + " ,  que está localizado na Linha: " + casaMaior7[0]);
		System.out.println("O menor numero da Coluuna 7 é: " + menor7 + " ,  que está localizado na Linha: " + casaMenor7[1]);
		
	}
}

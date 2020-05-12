package com.giovana.exercios.aula20;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		
		int[][] M = new int[3][3];
		int quantidadePar = 0;
		int quantidadeImpar = 0;
		
		Random random = new Random();
		for(int i = 0; i < M.length ; i++) {
			for(int j = 0; j < M[i].length ; j++) {
				System.out.print("Digite um nuemro para a Linha " + (i+ 1) + " - Coluna " + (j + 1) + "\n");
				M[i][j] = numeros.nextInt();
				if(M[i][j] % 2 == 1) {
					quantidadeImpar++;
				}else {
					quantidadePar++;
				}
			}
			System.out.println(" ");
		}
		
		for(int i = 0; i < M.length ; i++) {
			for(int j = 0; j < M[i].length ; j++) {
				System.out.print(M[i][j] + "  ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Quantidade de numeros par: " + quantidadePar);
		System.out.println("Quantidade de numeros impares: " + quantidadeImpar);
	}
}

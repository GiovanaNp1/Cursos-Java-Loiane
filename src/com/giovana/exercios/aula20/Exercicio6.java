package com.giovana.exercios.aula20;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [][]tabuleiro = new String [3][3];
		String vezJogada = " X ";
		boolean vencedor = false;
		int jogadas = 0;
		int linha;
		int coluna;
		
		for(int i = 0; i < tabuleiro.length ; i++) {
			for(int j = 0; j < tabuleiro[i].length ; j++) {
				tabuleiro[i][j] = " - ";
			}
		}
		System.out.println("Jogo da velha!!! ʕ•́ᴥ•̀ʔっ");
		System.out.println("   0  1  2");
		for(int i = 0; i < tabuleiro.length ; i++) {
			System.out.print(i + " ");
			for(int j = 0; j < tabuleiro[i].length ; j++) {
				System.out.print(tabuleiro[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		while(!vencedor && jogadas != 9) {
			System.out.println("Linha: ");
			linha = scan.nextInt();
			while(linha >= tabuleiro.length || linha < 0) {
				System.out.println("Jogada não permitida");
				System.out.println("X (linha)");
				linha = scan.nextInt();
			}
			System.out.println("Coluna: ");
			coluna = scan.nextInt();
			while(coluna >= tabuleiro.length || coluna < 0) {
				System.out.println("Jogada não permitida");
				System.out.println("Coluna: ");
				coluna = scan.nextInt();
			}
			if(tabuleiro[linha][coluna].equals(" - ") && !tabuleiro[linha][coluna].equals(" X ") && !tabuleiro[linha][coluna].equals(" O ")) {
				tabuleiro[linha][coluna] = vezJogada;
				jogadas++;
				if(vezJogada.equals(" X ")) {
					vezJogada = " O ";
				}else {
					vezJogada = " X ";
				}
				System.out.println("   0  1  2");
				for(int i = 0; i < tabuleiro.length ; i++) {
					System.out.print(i + " ");
					for(int j = 0; j < tabuleiro[i].length ; j++) {
						System.out.print(tabuleiro[i][j]);
					}
					System.out.println("");
				}
			}else {
				System.out.println("Jogada invalida >:( ");
			}
			if(tabuleiro[0][0].equals(" O ") && tabuleiro[0][1].equals(" O ") && tabuleiro[0][2].equals(" O ") ||
			   tabuleiro[1][0].equals(" O ") && tabuleiro[1][1].equals(" O ") && tabuleiro[1][2].equals(" O ") ||
			   tabuleiro[2][0].equals(" O ") && tabuleiro[2][1].equals(" O ") && tabuleiro[2][2].equals(" O ")) {
				vencedor = true;
				System.out.println("O jogador O é o vencedor");
				
			}
			if(tabuleiro[0][0].equals(" O ") && tabuleiro[1][0].equals(" O ") && tabuleiro[2][0].equals(" O ") ||
			   tabuleiro[0][1].equals(" O ") && tabuleiro[1][1].equals(" O ") && tabuleiro[2][1].equals(" O ") ||
			   tabuleiro[0][2].equals(" O ") && tabuleiro[1][2].equals(" O ") && tabuleiro[2][2].equals(" O ")) {
				vencedor = true;
				System.out.println("O jogador O é o vencedor");		
			}
			if(tabuleiro[0][0].equals(" O ") && tabuleiro[1][1].equals(" O ") && tabuleiro[2][2].equals(" O ") ||
			   tabuleiro[0][2].equals(" O ") && tabuleiro[1][1].equals(" O ") && tabuleiro[2][0].equals(" O ")) {
				vencedor = true;
				System.out.println("O jogador O é o vencedor");
			}
			if(tabuleiro[0][0].equals(" X ") && tabuleiro[0][1].equals(" X ") && tabuleiro[0][2].equals(" X ") ||
			   tabuleiro[1][0].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[1][2].equals(" X ") ||
			   tabuleiro[2][0].equals(" X ") && tabuleiro[2][1].equals(" X ") && tabuleiro[2][2].equals(" X ")) {
						vencedor = true;
						System.out.println("O jogador X é o vencedor");
						
			}
			if(tabuleiro[0][0].equals(" X ") && tabuleiro[1][0].equals(" X ") && tabuleiro[2][0].equals(" X ") ||
			   tabuleiro[0][1].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[2][1].equals(" X ") ||
			   tabuleiro[0][2].equals(" X ") && tabuleiro[1][2].equals(" X ") && tabuleiro[2][2].equals(" X ")) {
						vencedor = true;
						System.out.println("O jogador X é o vencedor");		
				}
			if(tabuleiro[0][0].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[2][2].equals(" X ") ||
				tabuleiro[0][2].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[2][0].equals(" X ")) {
						vencedor = true;
						System.out.println("O jogador X é o vencedor");
			}
			
		}
		if(jogadas == 9) {
			System.out.println("Empate!");
		}
	}
}





package com.giovana.exercios.aula15;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner data  = new Scanner(System.in);
		
		int dia;
		System.out.println("Digita um numero entre 1 a 7 para descobrir o dia correspondente a semana:");
		dia = data.nextInt();
		
		switch(dia) {
			case 1: 
				System.out.println(dia + " - Domingo");
				break;
			case 2:
				System.out.println(dia + " - Segunda");
				break;
			case 3:
				System.out.println(dia + " - Terça");
				break;
			case 4:
				System.out.println(dia + " - Quarta");
				break;
			case 5:
				System.out.println(dia + " - Quinta");
				break;
			case 6:
				System.out.println(dia + " - Sexta");
				break;
			case 7:
				System.out.println(dia + " - Sabado");
				break;	
			default:
				System.out.println("Numero invalido");
			break;
		}
	}

}

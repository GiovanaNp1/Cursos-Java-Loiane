package com.giovana.exercios.aula15;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner letras = new Scanner(System.in);
		
		String letra;
		System.out.println("Digite uma letra para saber  se é uma vogal ou consoante");
		letra =  letras.next();
		
		switch(letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U": System.out.println("Essa letra é uma vogal");
			break;

		default: System.out.println("Essa letra é uma consoante");
			break;
		}
	}

}

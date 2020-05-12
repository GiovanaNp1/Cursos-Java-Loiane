package com.giovana.exercios.aula15;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é "F" ou "M".
		//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		Scanner scan = new Scanner(System.in);
		
		String sexo;
		System.out.println("Qual o seu sexo: (F ou  M)");
		sexo = scan.next();
		if(sexo.equalsIgnoreCase("f")) {
			System.out.println("Seu sexo é Feminino");
		}else if(sexo.equalsIgnoreCase("m")){
			System.out.println("Seu sexo é Masculino");
		}else {
			System.out.println("Sexo Invalido");
		}
		
	}

}

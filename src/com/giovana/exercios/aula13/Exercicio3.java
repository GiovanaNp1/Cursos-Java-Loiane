package com.giovana.exercios.aula13;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner numeros = new Scanner (System.in);
		
		int numero1;
		int numero2;
		int resultado;
		
		System.out.println("Digite aqui o primeiro numero");
		numero1  =  numeros.nextInt();
		System.out.println("Digite aqui o segundo numero");
		numero2 =  numeros.nextInt();
		resultado  = numero1 +  numero2;
		
		System.out.println("A soma dos numeros é de: " +  resultado);
	}

}

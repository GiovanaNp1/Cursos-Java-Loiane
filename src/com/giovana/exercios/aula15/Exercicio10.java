package com.giovana.exercios.aula15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner tempo = new Scanner(System.in);
		
		String periodo;
		System.out.println("Digite o periodo que você estuda");
		System.out.println("M-matutino");
		System.out.println("V-Vespertino");
		System.out.println("N- Noturno");
		periodo = tempo.next();
		
		if(periodo.equalsIgnoreCase("M")) {
			System.out.println("Bom dia");
		}else if (periodo.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde");
		}else if (periodo.equalsIgnoreCase("N")){
			System.out.println("Boa Noite");
		}else {
			System.out.println("Valor Inválido!");
		}
	}
}

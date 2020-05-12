package com.giovana.exercios.aula12;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		scan.useLocale(Locale.ENGLISH);
		
//		System.out.println("Digite seu nome completo:");
//		String nome = scan.nextLine();
//		System.out.println("Seu nome completo é: " +  nome);
//		
//		System.out.println("Digite seu primeito nome:");
//		String primeiroNome = scan.next();
//		System.out.println("Seu primeiro nome é: " +  primeiroNome);
//		
//		System.out.println("Digite a sua idade:");
//		int idade = scan.nextInt();
//		System.out.println("Sua idade é: " +  idade);
//		
//		System.out.println("Digite a sua altura:");
//		double altura = scan.nextDouble();
//		System.out.println("Sua altura é: " +  altura);
		
		System.out.println("Digite seu primeito nome, idade, quantidade de filhos, altura e se tem bichicnho:");
		String primeiroNome = scan.next();
		byte idade =  scan.nextByte();
		byte quantidadeFilhos =  scan.nextByte();
		float altura =  scan.nextFloat();
		boolean bichinho = scan.nextBoolean();
		
		System.out.println("Você tem os seguintes valores: ");
		System.out.println("Primeiro nome: " +  primeiroNome);
		System.out.println("idade: " +  idade);
		System.out.println("quantidade de filhos: " +  quantidadeFilhos);
		System.out.println("altura: " +  altura);
		System.out.println("tem bichinho? : " +  bichinho);
	}

}

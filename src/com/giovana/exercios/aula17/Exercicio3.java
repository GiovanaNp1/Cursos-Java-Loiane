package com.giovana.exercios.aula17;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Façaumprogramaqueleiaevalideasseguintesinformações:
//			a. Nome:maiorque3caracteres;
//		b. Idade:entre0e150;
//		c. Salário: maior que zero;
//		d. Sexo:'f'ou'm';
//		e. EstadoCivil:'s','c','v','d';
		Scanner texto = new Scanner(System.in);
		texto.useLocale(Locale.ENGLISH);
		
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		boolean valido = false;
		
		do {
		System.out.println("Digite seu nome ");
		nome = texto.nextLine();
		if(nome.length() >= 3) {
			valido = true;
		}else {
			System.out.println("Erro - o nome deve conter 3 ou mais caracteres");
		}
		} while(!valido);
		
		valido = false;
				
		do {
			System.out.println("Digite sua idade");
			idade = texto.nextInt();
			if(idade >= 0 && idade<= 150) {
				valido = true;
			}else {
				System.out.println("Erro - a idade deve ser entre 0 a 150");
			}
		} while(!valido);
		
		valido = false;
		
		do {
			System.out.println("Digite seu salario");
			salario = texto.nextDouble();
			if(salario > 0) {
				valido = true;
			}else {
				System.out.println("Erro - Seu salario tem de ser maior que 0");
			}
		} while(!valido);
		
		valido = false;
		
		do {
			System.out.println("Digite seu sexo");
			sexo = texto.nextLine();
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				valido = true;
			}else {
				System.out.println("Erro - Seu sexo tem de ser F ou M");
			}
		} while(!valido);
		
		valido = false;
		
		do {
			System.out.println("Digite seu estado civil");
			System.out.println("s - Solteira(o) | c - Casada(o)");
			System.out.println("v - Viuva(o) | d - Divorciada(o)");
			estadoCivil = texto.nextLine();
			if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("d")) {
				valido = true;
			}else {
				System.out.println("Erro - Seu estado civil tem de ser compativel com s, v, d ou c");
			}
		} while(!valido);
		
		System.out.println("Nome: " +  nome);
		System.out.println("Idade: " +  idade);
		System.out.println("Salario: " +  salario);
		System.out.println("Sexo: " +  sexo);
		System.out.println("Estado Civil: " +  estadoCivil);
		
	}
}

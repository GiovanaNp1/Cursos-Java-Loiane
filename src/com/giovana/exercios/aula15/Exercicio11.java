package com.giovana.exercios.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
			
		Scanner dinheiro = new Scanner(System.in);
		dinheiro.useLocale(Locale.ENGLISH);
		
		double salario, aumentoSalario;
		int percent;
		
		System.out.println("Digite aqui seu salario atual para descobrir qual foi o seu aumento");
		salario = dinheiro.nextDouble();
		
		if(salario <= 280.00){
			percent = 20;
		}else if(salario > 280.00 && salario < 700.00){
			percent = 15;
		}else if(salario >= 700.00 && salario < 1500.00){
			percent = 10;
		}else {
			percent = 5;
		}
		
		aumentoSalario = (salario / 100) * percent;
		System.out.println("salario antigo: " + salario);
		System.out.println("percentual de aumento aplicado: " + percent + "%" );
		System.out.println("o valor do aumento: R$" + aumentoSalario);
		System.out.println("novo salário, após o aumento: R$" + (aumentoSalario + salario));

	}

}

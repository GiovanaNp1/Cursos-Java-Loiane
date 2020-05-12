package com.giovana.exercios.aula15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner dinheiro = new Scanner(System.in);
		dinheiro.useLocale(Locale.ENGLISH);
		
		double salario, descontos, ir, valorIr ,valorHora, inss, fgts;
		int percent, horas;
		
		System.out.println("Digite aqui quanto você ganha por horas: ");
		valorHora =  dinheiro.nextDouble();
		System.out.println("Agora digite quantas horas você trabalha por mês: ");
		horas =  dinheiro.nextInt();
		
		salario = valorHora * horas;
		
		if(salario <= 900.00){
			ir = 0;
		}else if(salario > 900.00 && salario <= 1500.00) {
			ir = 5;
		}else if(salario > 1500.00 && salario <= 2500.00) {
			ir = 10;
		}else {
			ir = 20;
		}
		
		valorIr = (salario/100) * ir;
		inss = (salario/100) * 10;
		fgts = (salario/100) * 11;
		descontos = valorIr + inss;
		
		System.out.println("\nSalario Bruto: R$" + salario);
		System.out.println("(-) Imposto de Renda (" + ir + "%)  : R$" + valorIr);
		System.out.println("(-)INSS: (10%)  : R$" + inss);
		System.out.println("FGTS: (11%)  : R$" + fgts);
		System.out.println("Total de descontos  : R$" + descontos);
		System.out.println("Salario Liquido  : R$" + (salario - descontos));

		
	}
}

package com.giovana.exercios.aula13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner dinheiro = new Scanner(System.in);
		double ganhaHora, salarioLiquido, inss, sindicato, imposto, salarioBruto; 
		int horasMes;
		
		System.out.println("Digite aqui quanto você ganha por horas: ");
		ganhaHora =  dinheiro.nextDouble();
		System.out.println("Agora digite quantas horas você trabalha por mês: ");
		horasMes =  dinheiro.nextInt();
		
		
		salarioBruto = ganhaHora * horasMes;
		imposto = (salarioBruto/ 100 ) * 11;
		inss = (salarioBruto/ 100 ) * 8;
		sindicato = (salarioBruto/ 100 ) * 5;
		salarioLiquido = salarioBruto - imposto - inss - sindicato;
		
		System.out.println("Os resultados foram:");
		System.out.println("Salário Bruto : R$ " + salarioBruto); 
		System.out.println("Imposto de Renda (11%):   R$" + imposto);
		System.out.println("INSS (8%):   R$" +  inss);
		System.out.println("Sindicato ( 5%):   R$" +  sindicato);
		System.out.println("Salario Liquido: " +  salarioLiquido); 
		
	}

}

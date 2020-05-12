package com.giovana.exercios.aula20;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][]compromisso = new String[31][24];
		boolean sair = false;
		int opcao, dia, hora;
		
		while(!sair) {
			System.out.println("Está é a sua agenda pessoal, digite aqui o que deseja fazer");
			System.out.println("1 - Inserir um novo compromisso");
			System.out.println("2 - Verificar um compromisso no dia");
			System.out.println("3 - Verificar uma serie de Dias");
			System.out.println("");
			System.out.println("0 - Sair");
			
			opcao = scan.nextInt();
			
			switch(opcao) {
			case 1:
					System.out.println("Digite aqui o dia que queira marcar seu compromisso:");
					dia = scan.nextInt();
					dia -= 1;
					while(dia < 0 || dia > 30) {
						System.out.println("Dia invalido, por favor insira um novo dia");
						dia = scan.nextInt();
					}
					System.out.println("Agora digite aqui a hora que queira marcar seu compromisso:");
					hora = scan.nextInt();
					hora -= 1;
					while(hora < 0 || hora > 23) {
						System.out.println("Hora invalido, por favor insira uma hora valida");
						hora = scan.nextInt();
					}
					System.out.println("Digite aqui o seu compromisso:");
					compromisso[dia][hora] = scan.next();
					System.out.println("\nCompromisso marcado:");
					System.out.println("Dia " + (dia + 1) + " - " + (hora + 1) + " horas : " + compromisso[dia][hora]);
				break;
			case 2:
					System.out.println("Digite aqui o dia que queira ver seus compromissos:");
					dia = scan.nextInt();
					dia -= 1;
					while(dia < 0 || dia > 30) {
						System.out.println("Dia invalido, por favor insira um novo dia");
						dia = scan.nextInt();
					}
					System.out.println("Agora digite aqui a hora que queira ver seu compromisso:");
					hora = scan.nextInt();
					hora -= 1;
					while(hora < 0 || hora > 23) {
						System.out.println("Hora invalido, por favor insira uma hora valida");
						hora = scan.nextInt();
					}
					System.out.println("\nCompromissos marcados:");
					System.out.println("Dia " + (dia + 1) + " - " + (hora + 1) + " horas : " + compromisso[dia][hora]);
				break;
			case 3:
			case 0: sair = true;
			default: System.out.println("Opção invalida, por favor insira uma opção valida");
			
			}
		}
	}
}

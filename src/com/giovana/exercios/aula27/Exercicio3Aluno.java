package com.giovana.exercios.aula27;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3Aluno {
	public static void main(String[] args) {
		Aluno alunos = new Aluno();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com um nome");
		alunos.nome = scan.nextLine();
		System.out.println("Entre com uma matricula");
		alunos.matricula = scan.nextInt();
		System.out.println("Entre com o curso matriculado");
		alunos.cursoMatriculado = scan.nextLine();
		
		System.out.println("Ente com o nome de uma disciplina");
		for(int i = 0; i <= alunos.diciplinas.length; i++) {
			System.out.println("Disciplina " + i + ": ");
			alunos.diciplinas[i] = scan.nextLine();
		}
		
		System.out.println("Ente com as nota das seguintes disciplinas:");
		for(int i = 0; i <= alunos.notas.length; i++) {
			System.out.println("Disciplina de " + alunos.diciplinas[i] + ": ");
			for(int j =0;  j <= alunos.notas[i].j; j++) {
				System.out.println(j + " Nota : ");
				alunos.notas[i][j] = scan.nextInt();
			}
		}
		
	}
}	

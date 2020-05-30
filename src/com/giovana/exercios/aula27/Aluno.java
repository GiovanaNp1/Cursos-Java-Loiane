package com.giovana.exercios.aula27;

public class Aluno {
	String nome;
	int matricula;
	String cursoMatriculado;
	String[] diciplinas = new String[3];
	int[][] notas = new int[3][4];
	
	void mostrar() {
		System.out.println("Nome do Aluno: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso Matriculado: " + cursoMatriculado);
		System.out.println("Disciplinas: \n");
		for(int i = 0; i < diciplinas.length; i++){
			System.out.println(diciplinas[i]);
		}
		
		System.out.println("Notas: ");
		for(int i = 0; i <= diciplinas.length; i++) {
			System.out.println(diciplinas[i]);
			for(int j = 0, j <)
		}
	}
	
}

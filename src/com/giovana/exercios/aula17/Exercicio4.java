package com.giovana.exercios.aula17;

public class Exercicio4 {

	public static void main(String[] args) {
		double paisA, paisB;
		int anos;
		
		paisA = 80000;
		paisB = 200000;
		anos = 0;
		
		while(paisA < paisB) {
			paisA += (paisA /100) * 3;
			paisB += (paisB/100) * 1.5;
			anos++;
		}
		System.out.println("O Pais A vai passar o pais B depois de " + anos + " anos");
	}
}

package com.giovana.exercios.aula13;

public class CurtoCircuito {
	public static void main(String[] args) {
		
		boolean verdadeiro =  true;
		boolean falso = false;
		boolean resultado1 =  falso & verdadeiro;
		//com somente um & ele somente da falso depois de analisar todas as linhas
		boolean resultado2 =  falso && verdadeiro;
		
		System.out.println(resultado1);
		System.out.println(resultado2);
	}
}

package com.giovana.exercios.aula33;

public class MinhaCalculadora {
	public int soma (int nu1, int num2) {
		return nu1 + num2;
	}
	
	public double soma (double nu1, double num2) {
		return nu1 + num2;
	}
	
	public int soma (int nu1, int num2, int num3) {
		return nu1 + num2 +  num3;
	}
	
	public int soma(int[] vetoresInteiros) {
		int total = 0;
		for (int i = 0; i < vetoresInteiros.length; i++) {
			total += vetoresInteiros[i];
		}
		
		return total;
	}
}

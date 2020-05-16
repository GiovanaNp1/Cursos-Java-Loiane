package com.giovana.exercios.aula35;

public class Calculadora {
	public static int factorial(int num) {
		if(num == 0) {
			return 1;
		}
		
		return num * factorial (num-1);
	}
}

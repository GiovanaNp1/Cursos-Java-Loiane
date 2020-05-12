package com.giovana.exercios.aula13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner tamanho = new Scanner(System.in);
		tamanho.useLocale(Locale.ENGLISH);
		
		double arquivo, velocidade, tempoDownload;
		System.out.println("Digite aqui o tamanho do seu arquivo para download (em MB):");
		arquivo =  tamanho.nextDouble();
		System.out.println("Agora, digite aqui a velocidade da sua internet (em Mbps)");
		velocidade = tamanho.nextDouble();
		
		velocidade = velocidade / 8;
		
		tempoDownload = (arquivo / velocidade);
		System.out.println("O download em tempo aproximado será feito em " + tempoDownload +  " segundos");
	}

}

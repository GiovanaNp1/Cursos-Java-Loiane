package com.giovana.exercios.aula27;

public class Lampada {
	//screva uma classe para representar uma lâmpada. Desenvolva método para ligar, desligar a lampada.
	String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    
    boolean ligado;
	
	void ligarLampada() {
		System.out.println("A lampada esta ligada");
		ligado = true;
	}
	
	void desligarLampada() {
		System.out.println("A lampada esta desligada");
		ligado = true;
	}
}

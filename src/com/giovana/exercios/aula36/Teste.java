package com.giovana.exercios.aula36;

public class Teste {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		contato.setEndereco("King Landing");
		contato.setTelefone("11 99999 9999");
		
		System.out.println(contato.getNome());
		System.out.println(contato.getEndereco());
		System.out.println(contato.getTelefone());
		
	}

}

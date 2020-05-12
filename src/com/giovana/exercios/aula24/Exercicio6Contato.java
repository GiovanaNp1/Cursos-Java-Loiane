package com.giovana.exercios.aula24;

public class Exercicio6Contato {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.cargo = "Estagiaria";
		contato.celular = 953139265;
		contato.email = "giovana.np1@gmail.com";
		contato.empresa = "IBM";
		contato.nome = "Giovana";
		contato.telefone = 46674730;
		
		System.out.println("Nome: " + contato.nome);
		System.out.println("Cargo: " + contato.cargo);
		System.out.println("Email: " + contato.email);
		System.out.println("Empresa: " + contato.empresa);
		System.out.println("Celular: " + contato.celular);
		System.out.println("Telefone: " + contato.telefone);
	}
}

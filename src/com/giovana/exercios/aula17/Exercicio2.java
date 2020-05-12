package com.giovana.exercios.aula17;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//  Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
		Scanner texto = new Scanner(System.in);
		
		String usuario, senha;
		System.out.println("Digite seu nome de usuario: ");
		usuario = texto.next();
		System.out.println("Agora digite sua senha: ");
		senha = texto.next();
		
		while(usuario.equals(senha)) {
			System.out.println("ERRO - Sua senha não pode o mesmo que o nome de usuario");
			System.out.println("Digite seu nome de usuario: ");
			usuario = texto.next();
			System.out.println("Agora digite sua senha: ");
			senha = texto.next();
		}
		System.out.println("Autenticado com sucesso");
	}

}

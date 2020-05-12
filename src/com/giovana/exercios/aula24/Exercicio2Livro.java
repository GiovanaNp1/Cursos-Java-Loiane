package com.giovana.exercios.aula24;

import java.util.Date;

public class Exercicio2Livro {
	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.anoLancamento = 2017;
		livro.autor = "Mark Manson";
		livro.capa = "comum";
		livro.descricao = "Chega de tentar buscar um sucesso que só existe na sua cabeça. "
				+ "Chega de se torturar para pensar positivo enquanto sua vida vai ladeira abaixo."
				+ " Chega de se sentir inferior por não ver o lado bom de estar no fundo do poço.";
		livro.editora = "Intrínseca";
		livro.genero = "autoajuda";
		livro.idioma="Portugues";
		livro.nome="A sutil arte de ligar o f*da-se";
		livro.paginas = 224;
		livro.preco = 21.99;
		livro.emprestado = true;
		livro.emprestadoA =  "Giovana";
		livro.dataEntrega = new Date();
		
		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Autor: " + livro.autor);
		System.out.println("R$" + livro.preco );
		System.out.println("");
		System.out.println("Está emprestado: " + livro.emprestado);
		System.out.println("Nome da pessoa que está com o livro: " + livro.emprestadoA);
		System.out.println("Data de entrega: " + livro.dataEntrega);

	}
}

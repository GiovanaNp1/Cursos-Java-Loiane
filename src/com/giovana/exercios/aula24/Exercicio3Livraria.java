package com.giovana.exercios.aula24;

import java.util.Date;

public class Exercicio3Livraria {

	public static void main(String[] args) {
Livro livro = new Livro();
		
		livro.anoLancamento = 2017;
		livro.autor = " Margaret Atwood";
		livro.capa = "comum";
		livro.descricao = "O romance distópico O conto da aia, de Margaret Atwood, se passa num futuro muito próximo "
				+ "e tem como cenário uma república onde não existem mais jornais, revistas, livros nem filmes";
		livro.editora = "Rocco";
		livro.genero = "Ficção Científica Distópico";
		livro.idioma="Portugues";
		livro.nome="O conto da aia ";
		livro.paginas = 368;
		livro.preco = 32.32;

		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Autor: " + livro.autor);
		System.out.println("R$" + livro.preco );
	}

}

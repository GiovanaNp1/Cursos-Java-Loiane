package com.giovana.exercios.aula36;

public class Contato {
	private String nome;
//	private Endereco endereco;
//	private String telefone;
	Endereco endereco = new Endereco();
	private Telefone[] telefones; 
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}	
	
}

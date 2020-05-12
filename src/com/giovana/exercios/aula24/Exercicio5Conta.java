package com.giovana.exercios.aula24;

public class Exercicio5Conta {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.especial = true;
		conta.limite = 1200.00;
		conta.numero = 1234567889;
		conta.saldo = 120.00;
		
		System.out.println("Numero da conta: " + conta.numero);
		System.out.println("Limite da Conta: R$" + conta.limite);
		System.out.println("Conta especial: " + conta.especial);
		System.out.println("Saldo: R$" + conta.saldo);
	}
}

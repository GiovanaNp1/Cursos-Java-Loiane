package com.giovana.exercios.aula27;

public class ContaCorrente {
	int numero;
	double chequeEspecial;
	double limite;
	double saldo;
	boolean especial;
	
	boolean realizarSaque(double quantiaSacar){
		if(saldo >= quantiaSacar) {
			saldo -= quantiaSacar;
			return true;
		}else {
			if(especial){
				double limite = this.limite + saldo;
				if(limite >= quantiaSacar) {
					saldo -=  quantiaSacar;
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
	}
	
	void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	void consultarSaldo () {
		System.out.println("O seu saldo é de: " + saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
}

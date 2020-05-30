package com.giovana.exercios.aula36;

public class Teste {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Tyrion");
//		contato.setEndereco("King Landing");
//		contato.setTelefone("11 99999 9999");
		Endereco end = new Endereco();
		end.setNomeRua("Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("King Landing");
		end.setEstado("Westeros");
		end.setCep("99999999");
		
		contato.setEndereco(end);
		
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setNumero("9999-9999");
		telefone.setDdd("11");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("fixo");
		telefone2.setNumero("88888-9999");
		telefone2.setDdd("15");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		
		System.out.println(contato.getNome());
		System.out.println(contato.getEndereco().getCidade());
//		System.out.println(contato.getTelefones());
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
	}

}

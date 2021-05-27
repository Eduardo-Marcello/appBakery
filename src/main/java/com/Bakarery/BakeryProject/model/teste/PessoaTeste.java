package com.Bakarery.BakeryProject.model.teste;

import com.Bakarery.BakeryProject.model.negocio.Pessoa;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setId(1);
		p1.setNome("Eduardo");
		p1.setEmail("eduardo@gmail.com");
		System.out.println("Pessoa: " + p1);
		
		Pessoa p2 = new Pessoa("Maria", "maria@maria.com");
		p2.setId(2);
		System.out.println("Pessoa: " + p2);
	}
}


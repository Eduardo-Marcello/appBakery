package com.Bakarery.BakeryProject.model.teste;

import com.Bakarery.BakeryProject.model.negocio.Usuario;

public class UsuarioTeste {

	public static void main(String[] args) {
		
		Usuario p1 = new Usuario();
		p1.setId(1);
		p1.setNome("Eduardo");
		p1.setEmail("eduardo@gmail.com");
		p1.setPassword("678");
		System.out.println("Pessoa: " + p1);
		
		Usuario p2 = new Usuario("Maria", "maria@maria.com", "234");
		p2.setId(2);
		System.out.println("Pessoa: " + p2);
	}
}


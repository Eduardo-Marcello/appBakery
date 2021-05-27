package com.Bakarery.BakeryProject.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bakarery.BakeryProject.model.negocio.Pessoa;
import com.Bakarery.BakeryProject.model.repository.IPessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private IPessoaRepository pessoaRepository;


		public String obterStatus(Pessoa pessoa) {
			
			return pessoa.calcularSalarioAnual() > 999 ? 
					pessoa.getNome() + ", que pessoa rica" : 
						"Poxa, "+ pessoa.getNome()+"!!! Tá difícil, né?!";  

		}
		
		public void incluir(Pessoa pessoa) {
			pessoaRepository.save(pessoa);
		}

}

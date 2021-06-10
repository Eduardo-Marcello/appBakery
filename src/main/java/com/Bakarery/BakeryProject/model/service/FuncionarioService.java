package com.Bakarery.BakeryProject.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bakarery.BakeryProject.model.negocio.Funcionario;
import com.Bakarery.BakeryProject.model.repository.IFuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private IFuncionarioRepository funcionarioRepository;
	
	public void incluir(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}
}

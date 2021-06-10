package com.Bakarery.BakeryProject.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Bakarery.BakeryProject.model.negocio.Cliente;
import com.Bakarery.BakeryProject.model.repository.IClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private IClienteRepository clienteRepository;
	
	public void incluir(Cliente cliente) {
		clienteRepository.save(cliente);
	}
}

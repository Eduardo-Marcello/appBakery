package com.Bakarery.BakeryProject.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bakarery.BakeryProject.model.negocio.Buffet;
import com.Bakarery.BakeryProject.model.repository.IBuffetRepository;
@Service
public class BuffetService {

	@Autowired
	private IBuffetRepository buffetRepository;

	public void incluir(Buffet buffet) {
		buffetRepository.save(buffet);
	}

	public List<Buffet> obterLista() {

		return (List<Buffet>) buffetRepository.findAll();
	}

	public void excluir(Integer id) {
		buffetRepository.deleteById(id);
	}
}

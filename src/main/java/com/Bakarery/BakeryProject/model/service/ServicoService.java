package com.Bakarery.BakeryProject.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bakarery.BakeryProject.model.negocio.Servico;
import com.Bakarery.BakeryProject.model.repository.IServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private IServicoRepository servicoRepository;

	public List<Servico> obterLista() {

		return (List<Servico>) servicoRepository.findAllByOrderByNomeServico();
	}

	public void excluir(Integer id) {
		servicoRepository.deleteById(id);
	}
}

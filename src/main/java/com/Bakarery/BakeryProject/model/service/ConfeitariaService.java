package com.Bakarery.BakeryProject.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bakarery.BakeryProject.model.negocio.Confeitaria;
import com.Bakarery.BakeryProject.model.repository.IConfeitariaRepository;

@Service
public class ConfeitariaService {

	@Autowired
	private IConfeitariaRepository confeitariaRepository;

	public void incluir(Confeitaria confeitaria) {
		confeitariaRepository.save(confeitaria);
	}

	public List<Confeitaria> obterLista() {

		return (List<Confeitaria>) confeitariaRepository.findAllByOrderByNomeDoce();
	}

	public void excluir(Integer id) {
		confeitariaRepository.deleteById(id);
	}
}

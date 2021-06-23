package com.Bakarery.BakeryProject.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bakarery.BakeryProject.model.negocio.Conveniencia;
import com.Bakarery.BakeryProject.model.negocio.Usuario;
import com.Bakarery.BakeryProject.model.repository.IConvenienciaRepository;

@Service
public class ConvenienciaService {

	@Autowired
	private IConvenienciaRepository convenienciaRepository;

	public void incluir(Conveniencia conveniencia) {
		convenienciaRepository.save(conveniencia);
	}

	public List<Conveniencia> obterLista() {

		return (List<Conveniencia>) convenienciaRepository.findAll();
	}

	public void excluir(Integer id) {
		convenienciaRepository.deleteById(id);
	}
}

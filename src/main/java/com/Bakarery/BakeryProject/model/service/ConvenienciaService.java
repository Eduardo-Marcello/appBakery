package com.Bakarery.BakeryProject.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bakarery.BakeryProject.model.negocio.Conveniencia;
import com.Bakarery.BakeryProject.model.repository.IConvenienciaRepository;

@Service
public class ConvenienciaService {
	
	@Autowired
	private IConvenienciaRepository convenienciaRepository;
	
	public void incluir(Conveniencia conveniencia) {
		convenienciaRepository.save(conveniencia);
	}
}

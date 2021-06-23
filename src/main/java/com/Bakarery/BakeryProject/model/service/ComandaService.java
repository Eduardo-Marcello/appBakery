package com.Bakarery.BakeryProject.model.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Bakarery.BakeryProject.model.negocio.Comanda;
import com.Bakarery.BakeryProject.model.negocio.Usuario;
import com.Bakarery.BakeryProject.model.repository.IComandaRepository;

@Service
public class ComandaService {
	@Autowired
	private IComandaRepository comandaRepository;
	Date dataHora = new Date();
		
		public void incluir(Comanda comanda) {
			comandaRepository.save(comanda);
		}
		
		public void adicionarDataHora(Comanda comanda) {
			Date dataHora = new Date();
			String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHora);
			String hora = new SimpleDateFormat("HH:mm:ss").format(dataHora);
			comanda.setData(data);
			comanda.setHora(hora);
		}

		public List<Comanda> obterLista(Usuario usuario) {
			return (List<Comanda>) comandaRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "data"));
		}
		
		public void excluir(Integer id) {
			comandaRepository.deleteById(id);
		}
		
	
}

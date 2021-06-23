package com.Bakarery.BakeryProject.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bakarery.BakeryProject.model.negocio.Servico;

@Repository
public interface IServicoRepository extends CrudRepository<Servico, Integer>{
	List<Servico> findAllByOrderByNomeServico();
}
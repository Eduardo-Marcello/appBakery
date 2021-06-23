package com.Bakarery.BakeryProject.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bakarery.BakeryProject.model.negocio.Conveniencia;

@Repository
public interface IConvenienciaRepository extends CrudRepository<Conveniencia, Integer>{
	List<Conveniencia> findAllByOrderByNomeProduto();
}
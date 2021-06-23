package com.Bakarery.BakeryProject.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bakarery.BakeryProject.model.negocio.Confeitaria;

@Repository
public interface IConfeitariaRepository extends CrudRepository<Confeitaria, Integer>{
	List<Confeitaria> findAllByOrderByNomeDoce();
}
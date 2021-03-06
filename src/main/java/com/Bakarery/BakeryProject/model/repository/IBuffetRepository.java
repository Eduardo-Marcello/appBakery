package com.Bakarery.BakeryProject.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bakarery.BakeryProject.model.negocio.Buffet;

@Repository
public interface IBuffetRepository extends CrudRepository<Buffet, Integer>{
	List<Buffet> findAllByOrderByPrato();
}
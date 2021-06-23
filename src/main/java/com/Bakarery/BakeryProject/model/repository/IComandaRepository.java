package com.Bakarery.BakeryProject.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bakarery.BakeryProject.model.negocio.Comanda;

@Repository
public interface IComandaRepository extends CrudRepository<Comanda, Integer>{

	@Query("from Comanda c where c.usuario.id =:userid")
	public List<Comanda> obterLista(Integer userid, Sort sort);
	
}

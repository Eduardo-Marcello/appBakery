package com.Bakarery.BakeryProject.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bakarery.BakeryProject.model.negocio.Funcionario;

@Repository
public interface IFuncionarioRepository extends CrudRepository<Funcionario, Integer>{
	@Query("from Funcionario f where f.usuario.id =:userid")
	public List<Funcionario> obterLista(Integer userid, Sort sort);
}
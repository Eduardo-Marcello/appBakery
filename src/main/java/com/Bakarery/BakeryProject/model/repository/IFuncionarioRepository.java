package com.Bakarery.BakeryProject.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bakarery.BakeryProject.model.negocio.Funcionario;

@Repository
public interface IFuncionarioRepository extends CrudRepository<Funcionario, Integer>{

		@Query("from Funcionario f where f.email=:email and f.password=:password")
		public Funcionario autenticacao(String email, String password);
}
package com.Bakarery.BakeryProject.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Bakarery.BakeryProject.model.negocio.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	@Query("from Usuario u where u.email=:email and u.password=:password")
	public Usuario autenticacao(String email, String password);
	List<Usuario> findAllByOrderByNome();
}

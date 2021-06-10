package com.Bakarery.BakeryProject.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bakarery.BakeryProject.model.negocio.Usuario;
import com.Bakarery.BakeryProject.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
		
		public void incluir(Usuario usuario) {
			usuarioRepository.save(usuario);
		}

		public List<Usuario> obterLista() {
		
			return (List<Usuario>) usuarioRepository.findAll();
		}
		
		public void excluir(Integer id) {
			usuarioRepository.deleteById(id);
		}

		public Usuario validacao(String email, String password) {
			return usuarioRepository.autenticacao(email, password);
		}
}

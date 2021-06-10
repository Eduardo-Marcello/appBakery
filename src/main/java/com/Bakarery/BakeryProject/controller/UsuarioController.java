package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakarery.BakeryProject.model.negocio.Usuario;
import com.Bakarery.BakeryProject.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value  = "/pessoa/incluir", method = RequestMethod.POST )
	public String incluir(Usuario usuario, Model model) {
		System.out.println(usuario);
		System.out.println(usuario.getNome() + " cadastrado com sucesso!");
		
		String mensagem = usuarioService.obterStatus(usuario);
		
		System.out.println(mensagem);
		
		usuarioService.incluir(usuario);

		return "redirect:/";
	}
}

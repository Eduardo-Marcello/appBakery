package com.Bakarery.BakeryProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Bakarery.BakeryProject.model.negocio.Funcionario;
import com.Bakarery.BakeryProject.model.negocio.Usuario;
import com.Bakarery.BakeryProject.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/usuario", method =  RequestMethod.GET)
	public String telaCadastroUsuario() {
		return "usuario/cadastro";
	}
	
	@RequestMapping(value  = "/usuario/incluir", method = RequestMethod.POST )
	public String incluir(Usuario usuario, Model model) {
		System.out.println(usuario);
		System.out.println(usuario.getNome() + " cadastrado com sucesso!");
		
		usuarioService.incluir(usuario);

		return "redirect:/usuario/lista";
	}
	
	@PostMapping(value = "/usuario/login")
	public String validarLogin(Model model, @RequestParam String email, @RequestParam String password) {
		
		Usuario usuario = usuarioService.validacao(email, password);
		
		if(usuario != null) {
			model.addAttribute("user", usuario);
			return "redirect:/home";
		}
		return "redirect:/";
	}
	
	@GetMapping(value = "/usuario/lista")
	public String obterLista(Model model) {
		
		model.addAttribute("usuarios", usuarioService.obterLista());
		return "usuario/lista";
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		usuarioService.excluir(id);
		
		return "redirect:/usuario/lista";
	}

}

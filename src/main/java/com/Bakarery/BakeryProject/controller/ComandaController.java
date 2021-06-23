package com.Bakarery.BakeryProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.Bakarery.BakeryProject.model.negocio.Comanda;
import com.Bakarery.BakeryProject.model.negocio.Funcionario;
import com.Bakarery.BakeryProject.model.negocio.Usuario;
import com.Bakarery.BakeryProject.model.service.ComandaService;
import com.Bakarery.BakeryProject.model.service.FuncionarioService;
import com.Bakarery.BakeryProject.model.service.UsuarioService;

@Controller
public class ComandaController {
	
	@Autowired
	private ComandaService comandaService;
	@Autowired
	private FuncionarioService funcionarioService;

	@RequestMapping(value = "/cadastroComanda", method =  RequestMethod.GET)
	public String telaCadastroComanda(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("funcionarios",funcionarioService.obterLista(usuario));
		return "comanda/cadastroComanda";
	}
	
	@RequestMapping(value  = "/comanda/incluir", method = RequestMethod.POST )
	public String incluir(Comanda comanda, Model model, @SessionAttribute("user") Usuario usuario) {
		
		comanda.setUsuario(usuario);
		comandaService.adicionarDataHora(comanda);
		comandaService.incluir(comanda);
		return "redirect:/comanda/lista";
	}
	
	@GetMapping(value = "/comanda/lista")
	public String obterLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("comandas", comandaService.obterLista(usuario));
		
		return "comanda/lista";
	}
	
	@GetMapping(value = "/comanda/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		comandaService.excluir(id);
		return "redirect:/comanda/lista";
	}
}

package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakarery.BakeryProject.model.negocio.Comanda;
import com.Bakarery.BakeryProject.model.service.ComandaService;

@Controller
public class ComandaController {
	
	@Autowired
	private ComandaService comandaService;
	
	@RequestMapping(value = "/cadastroComanda", method =  RequestMethod.GET)
	public String telaCadastroComanda() {
		return "comanda/cadastroComanda";
	}
	
	@RequestMapping(value  = "/comanda/incluir", method = RequestMethod.POST )
	public String incluir(Comanda comanda, Model model) {
		
		comandaService.adicionarDataHora(comanda);
		comandaService.incluir(comanda);
		return "redirect:/comanda/lista";
	}
	
	@GetMapping(value = "/comanda/lista")
	public String obterLista(Model model) {
		
		model.addAttribute("comandas", comandaService.obterLista());
		return "comanda/lista";
	}
	
	@GetMapping(value = "/comanda/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		comandaService.excluir(id);
		return "redirect:/comanda/lista";
	}
}

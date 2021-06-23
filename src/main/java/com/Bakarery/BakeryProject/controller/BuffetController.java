package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakarery.BakeryProject.model.negocio.Buffet;
import com.Bakarery.BakeryProject.model.service.BuffetService;

@Controller
public class BuffetController {
	
	@Autowired
	private BuffetService buffetService;
	
	@RequestMapping(value = "/cadastroBuffet", method =  RequestMethod.GET)
	public String telaCadastroBuffet() {
		return "buffet/cadastroBuffet";
	}
	
	@RequestMapping(value  = "/buffet/incluir", method = RequestMethod.POST )
	public String incluir(Buffet buffet) {
		
		buffetService.incluir(buffet);
		return "redirect:/buffet/lista";
	}
	
	@GetMapping(value = "/buffet/lista")
	public String obterLista(Model model) {
		
		model.addAttribute("buffet", buffetService.obterLista());
		return "buffet/lista";
	}
	
	@GetMapping(value = "/buffet/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		buffetService.excluir(id);
		
		return "redirect:/buffet/lista";
	}
}

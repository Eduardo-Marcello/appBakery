package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakarery.BakeryProject.model.negocio.Conveniencia;
import com.Bakarery.BakeryProject.model.service.ConvenienciaService;

@Controller
public class ConvenienciaController {
	
	@Autowired
	private ConvenienciaService convenienciaService;
	
	@RequestMapping(value = "/cadastroConveniencia", method =  RequestMethod.GET)
	public String telaCadastroConveniencia() {
		return "conveniencia/cadastroConveniencia";
	}
	
	@RequestMapping(value  = "/conveniencia/incluir", method = RequestMethod.POST )
	public String incluir(Conveniencia conveniencia) {
		
		convenienciaService.incluir(conveniencia);
		return "redirect:/conveniencia/lista";
	}
	
	@GetMapping(value = "/conveniencia/lista")
	public String obterLista(Model model) {
		
		model.addAttribute("produtos", convenienciaService.obterLista());
		return "conveniencia/lista";
	}
	
	@GetMapping(value = "/conveniencia/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		convenienciaService.excluir(id);
		
		return "redirect:/conveniencia/lista";
	}
}

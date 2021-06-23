package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakarery.BakeryProject.model.negocio.Confeitaria;
import com.Bakarery.BakeryProject.model.negocio.Conveniencia;
import com.Bakarery.BakeryProject.model.service.ConfeitariaService;
import com.Bakarery.BakeryProject.model.service.ConvenienciaService;

@Controller
public class ConfeitariaController {
	
	@Autowired
	private ConfeitariaService confeitariaService;
	
	@RequestMapping(value = "/cadastroConfeitaria", method =  RequestMethod.GET)
	public String telaCadastroConfeitaria() {
		return "confeitaria/cadastroConfeitaria";
	}
	
	@RequestMapping(value  = "/confeitaria/incluir", method = RequestMethod.POST )
	public String incluir(Confeitaria confeitaria) {
		
		confeitariaService.incluir(confeitaria);
		return "redirect:/confeitaria/lista";
	}
	
	@GetMapping(value = "/confeitaria/lista")
	public String obterLista(Model model) {
		
		model.addAttribute("doces", confeitariaService.obterLista());
		return "confeitaria/lista";
	}
	
	@GetMapping(value = "/confeitaria/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		confeitariaService.excluir(id);
		
		return "redirect:/confeitaria/lista";
	}
}

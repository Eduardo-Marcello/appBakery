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
import com.Bakarery.BakeryProject.model.service.ServicoService;

@Controller
public class ServicoController {
	
	@Autowired
	private ServicoService servicoService;
	
	@GetMapping(value = "/servico/lista")
	public String obterLista(Model model) {
		
		model.addAttribute("servicos", servicoService.obterLista());
		return "servico/lista";
	}
	
	@GetMapping(value = "/servico/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		servicoService.excluir(id);
		
		return "redirect:/servico/lista";
	}
}

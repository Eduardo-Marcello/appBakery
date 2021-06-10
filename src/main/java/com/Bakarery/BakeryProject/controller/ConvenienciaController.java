package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakarery.BakeryProject.model.negocio.Conveniencia;
import com.Bakarery.BakeryProject.model.service.ConvenienciaService;

@Controller
public class ConvenienciaController {
	
	@Autowired
	private ConvenienciaService convenienciaService;
	
	@RequestMapping(value  = "/conveniencia/incluir", method = RequestMethod.POST )
	public String incluir(Conveniencia conveniencia, Model model) {
		
		System.out.println(conveniencia);
		convenienciaService.incluir(conveniencia);
		return "redirect:/";
	}
}

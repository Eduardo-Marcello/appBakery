package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakarery.BakeryProject.model.negocio.Buffet;
import com.Bakarery.BakeryProject.model.service.BuffetService;

@Controller
public class BuffetController {
	
	@Autowired
	private BuffetService buffetService;
	
	@RequestMapping(value  = "/buffet/incluir", method = RequestMethod.POST )
	public String incluir(Buffet buffet, Model model) {
		
		System.out.println(buffet);
		System.out.println(buffet.getPrato() + " cadastrado com sucesso!");
		buffetService.incluir(buffet);
		return "redirect:/";
	}
}

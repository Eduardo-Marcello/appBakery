package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakarery.BakeryProject.model.negocio.Cliente;
import com.Bakarery.BakeryProject.model.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value  = "/cliente/incluir", method = RequestMethod.POST )
	public String incluir(Cliente cliente, Model model) {
		
		System.out.println(cliente);
		System.out.println(cliente.getNome() + " cadastrado com sucesso!");
		clienteService.incluir(cliente);
		return "redirect:/";
	}
}

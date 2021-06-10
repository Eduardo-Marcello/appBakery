package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakarery.BakeryProject.model.negocio.Cliente;
import com.Bakarery.BakeryProject.model.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "/cadastroCliente", method =  RequestMethod.GET)
	public String telaCadastroCliente() {
		return "cliente/cadastroCliente";
	}
	
	@RequestMapping(value  = "/cliente/incluir", method = RequestMethod.POST )
	public String incluir(Cliente cliente, Model model) {
		
		System.out.println(cliente);
		System.out.println(cliente.getNome() + " cadastrado com sucesso!");
		clienteService.incluir(cliente);
		return "redirect:/cliente/lista";
	}
	
	@GetMapping(value = "/cliente/lista")
	public String obterLista(Model model) {
		
		model.addAttribute("clientes", clienteService.obterLista());
		return "cliente/lista";
	}
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		clienteService.excluir(id);
		
		return "redirect:/cliente/lista";
	}
}

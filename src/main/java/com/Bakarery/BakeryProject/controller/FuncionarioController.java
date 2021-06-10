package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakarery.BakeryProject.model.negocio.Funcionario;
import com.Bakarery.BakeryProject.model.service.FuncionarioService;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@RequestMapping(value  = "/funcionario/incluir", method = RequestMethod.POST )
	public String incluir(Funcionario funcionario, Model model) {
		
		System.out.println(funcionario);
		System.out.println(funcionario.getNome() + " cadastrado com sucesso!");
		funcionarioService.incluir(funcionario);
		return "redirect:/";
	}
}

package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakarery.BakeryProject.model.negocio.Pessoa;
import com.Bakarery.BakeryProject.model.service.PessoaService;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(value  = "/pessoa/incluir", method = RequestMethod.POST )
	public String incluir(Pessoa pessoa, Model model) {
		System.out.println(pessoa);
		System.out.println(pessoa.getNome() + " cadastrado com sucesso!");
		
		String mensagem = pessoaService.obterStatus(pessoa);
		
		System.out.println(mensagem);
		
		pessoaService.incluir(pessoa);

		return "redirect:/";
	}
}

package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Bakarery.BakeryProject.model.negocio.Funcionario;
import com.Bakarery.BakeryProject.model.service.FuncionarioService;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@RequestMapping(value = "/cadastroFuncionario", method =  RequestMethod.GET)
	public String telaCadastroFuncionario() {
		return "funcionario/cadastroFuncionario";
	}
	
	@RequestMapping(value  = "/funcionario/incluir", method = RequestMethod.POST )
	public String incluir(Funcionario funcionario, Model model) {
		
		System.out.println(funcionario);
		System.out.println(funcionario.getNome() + " cadastrado com sucesso!");
		funcionarioService.incluir(funcionario);
		return "redirect:/funcionario/lista";
	}
	
	@GetMapping(value = "/funcionario/lista")
	public String obterLista(Model model) {
		
		model.addAttribute("funcionarios", funcionarioService.obterLista());
		return "funcionario/lista";
	}
	
	@GetMapping(value = "/funcionario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		funcionarioService.excluir(id);
		
		return "redirect:/funcionario/lista";
	}
}

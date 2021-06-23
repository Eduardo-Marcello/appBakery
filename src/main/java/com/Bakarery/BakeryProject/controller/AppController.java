package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.Bakarery.BakeryProject.model.negocio.Usuario;
import com.Bakarery.BakeryProject.model.service.BuffetService;
import com.Bakarery.BakeryProject.model.service.ComandaService;
import com.Bakarery.BakeryProject.model.service.ConfeitariaService;
import com.Bakarery.BakeryProject.model.service.ConvenienciaService;
import com.Bakarery.BakeryProject.model.service.FuncionarioService;
import com.Bakarery.BakeryProject.model.service.UsuarioService;

@Controller
public class AppController {
	
	@Autowired
	private UsuarioService us;
	@Autowired
	private FuncionarioService fs;
	@Autowired
	private ComandaService cs;
	@Autowired
	private ConvenienciaService cvs;
	@Autowired
	private ConfeitariaService cfs;
	@Autowired
	private BuffetService bs;
		
		@RequestMapping(value = "/home", method =  RequestMethod.GET)
		public String telaInicial(Model model, @SessionAttribute("user") Usuario usuario) {
			
			model.addAttribute("usuarioQtde", us.obterLista().size());
			model.addAttribute("funcionarioQtde", fs.obterLista(usuario).size());
			model.addAttribute("comandaQtde", cs.obterLista(usuario).size());
			model.addAttribute("produtosQtde", cvs.obterLista().size());
			model.addAttribute("docesQtde", cfs.obterLista().size());
			model.addAttribute("pratosQtde", bs.obterLista().size());
			return "home";
		}
		
		@RequestMapping(value = "/", method =  RequestMethod.GET)
		public String telaLogin() {
			return "login";
		}
}

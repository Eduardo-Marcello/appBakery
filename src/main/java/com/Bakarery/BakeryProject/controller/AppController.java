package com.Bakarery.BakeryProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
		
		@RequestMapping(value = "/", method =  RequestMethod.GET)
		public String telaInicial() {
			return "index";
		}
		
		@RequestMapping(value = "/cadastroCliente", method =  RequestMethod.GET)
		public String telaCadastroCliente() {
			return "cliente/cadastroCliente";
		}
		
		@RequestMapping(value = "/cadastroFuncionario", method =  RequestMethod.GET)
		public String telaCadastroFuncionario() {
			return "funcionario/cadastroFuncionario";
		}
		
		@RequestMapping(value = "/cadastroBuffet", method =  RequestMethod.GET)
		public String telaCadastroBuffet() {
			return "buffet/cadastroBuffet";
		}
		
		@RequestMapping(value = "/cadastroDelivery", method =  RequestMethod.GET)
		public String telaCadastroDelivery() {
			return "delivery/cadastroDelivery";
		}
		
		@RequestMapping(value = "/cadastroConveniencia", method =  RequestMethod.GET)
		public String telaCadastroConveniencia() {
			return "conveniencia/cadastroConveniencia";
		}
}

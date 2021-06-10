package com.Bakarery.BakeryProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakarery.BakeryProject.model.negocio.Delivery;
import com.Bakarery.BakeryProject.model.service.DeliveryService;

@Controller
public class DeliveryController {
	
	@Autowired
	private DeliveryService deliveryService;
	
	@RequestMapping(value  = "/delivery/incluir", method = RequestMethod.POST )
	public String incluir(Delivery delivery, Model model) {
		
		System.out.println(delivery);
		deliveryService.incluir(delivery);
		return "redirect:/";
	}
}

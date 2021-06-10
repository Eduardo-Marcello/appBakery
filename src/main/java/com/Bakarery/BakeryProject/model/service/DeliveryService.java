package com.Bakarery.BakeryProject.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bakarery.BakeryProject.model.negocio.Delivery;
import com.Bakarery.BakeryProject.model.repository.IDeliveryRepository;

@Service
public class DeliveryService {
	
	@Autowired
	private IDeliveryRepository deliveryRepository;
	
	public void incluir(Delivery delivery) {
		deliveryRepository.save(delivery);
	}
}

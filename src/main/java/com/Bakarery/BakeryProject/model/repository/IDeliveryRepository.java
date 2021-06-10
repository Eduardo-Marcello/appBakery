package com.Bakarery.BakeryProject.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bakarery.BakeryProject.model.negocio.Delivery;

@Repository
public interface IDeliveryRepository extends CrudRepository<Delivery, Integer>{

}

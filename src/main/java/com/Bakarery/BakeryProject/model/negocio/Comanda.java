package com.Bakarery.BakeryProject.model.negocio;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

public class Comanda {
	private Integer id;
	
	private Date dataHora = new Date();
	private double valor;
	private boolean encerra;
	
	private Funcionario funcionario;
	private List<Serviços> servicos;
	
	public Comanda(Integer id, double valor) {
		this.id = id;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	@Override
	public String toString() {
		return dataHora + " " + valor + " " + funcionario.getNome();
	}
	
	
	
}

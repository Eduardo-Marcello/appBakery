package com.Bakarery.BakeryProject.AT;

import java.util.Date;
import java.util.List;

public class Comanda {
	private Integer id;
	
	private Date dataHora = new Date();
	private double valor;
	private boolean encerra;
	
	private Funcionário funcionario;
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

	@Override
	public String toString() {
		return dataHora + " " + valor + " " + funcionario.getNome();
	}
	
	
	
}

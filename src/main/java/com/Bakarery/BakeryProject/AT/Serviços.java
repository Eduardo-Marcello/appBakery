package com.Bakarery.BakeryProject.AT;

public abstract class Serviços {
	private Integer id;
	
	private String nomeServico;
	private String situacao;
	private boolean flagSituacao;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNomeServico() {
		return nomeServico;
	}
	
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	
	@Override
	public String toString() {
		return nomeServico + " " + situacao + " ";
	}
	
	
	
}

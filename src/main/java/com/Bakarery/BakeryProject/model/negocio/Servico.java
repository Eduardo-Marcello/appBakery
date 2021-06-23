package com.Bakarery.BakeryProject.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name ="TServico")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Servico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeServico;
	private String situacao;
	private double preco;
	
	public Servico() {
		
	}
	
	public Servico(String nomeServico, String situacao, double preco) {
		this.nomeServico = nomeServico;
		this.situacao = situacao;
		this.preco = preco;
	}

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
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return nomeServico + " " + situacao + " ";
	}
	
	
	
}

package com.Bakarery.BakeryProject.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="TBuffet")
@PrimaryKeyJoinColumn(name = "id_servico")
public class Buffet extends Servico {

	private String situacao;
	private String prato;
	private double preco;
	
	public Buffet(String situacao, String prato, double preco) {
		this.situacao = situacao;
		this.prato = prato;
		this.preco = preco;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getPrato() {
		return prato;
	}

	public void setPrato(String prato) {
		this.prato = prato;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return super.toString()+" " + situacao + " " + prato + " " + preco;
	}

	
	
}

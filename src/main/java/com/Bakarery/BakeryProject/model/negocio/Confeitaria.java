package com.Bakarery.BakeryProject.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="TConfeitaria")
@PrimaryKeyJoinColumn(name = "id_servico")
public class Confeitaria extends Servico {
	
	private int codigoDoce;
	private String tipoDoce;
	private String nomeDoce;
	private double preco;
	
	public Confeitaria() {
		
	}
	
	public Confeitaria(int codigoDoce, String tipoDoce, String nomeDoce, double preco) {
		this.codigoDoce = codigoDoce;
		this.tipoDoce = tipoDoce;
		this.nomeDoce = nomeDoce;
		this.preco = preco;
	}

	public int getCodigoDoce() {
		return codigoDoce;
	}
	
	public void setCodigoDoce(int codigoDoce) {
		this.codigoDoce = codigoDoce;
	}
	
	public String getTipoDoce() {
		return tipoDoce;
	}
	
	public void setTipoDoce(String tipoDoce) {
		this.tipoDoce = tipoDoce;
	}
	
	public String getNomeDoce() {
		return nomeDoce;
	}
	
	public void setNomeDoce(String nomeDoce) {
		this.nomeDoce = nomeDoce;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Confeitaria [codigoDoce=" + codigoDoce + ", tipoDoce=" + tipoDoce + ", nomeDoce=" + nomeDoce
				+ ", preco=" + preco + "]";
	}
	
	
}

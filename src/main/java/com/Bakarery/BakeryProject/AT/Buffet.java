package com.Bakarery.BakeryProject.AT;

public class Buffet extends Serviços {
	private String situacao;
	private String prato;
	private double preco;

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

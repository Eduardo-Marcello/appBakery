package com.Bakarery.BakeryProject.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="TConveniencia")
@PrimaryKeyJoinColumn(name = "id_servico")
public class Conveniencia extends Servico {
	
	private int codigoProduto;
	private String nomeProduto;
	private String classificacao;

	public Conveniencia() {
		
	}
	
	public Conveniencia(int codigoProduto, String nomeProduto, String classificacao) {
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.classificacao = classificacao;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}


	@Override
	public String toString() {
		return super.toString()+ " "+ codigoProduto +" " + nomeProduto + " "
				+ classificacao;
	}
	
}
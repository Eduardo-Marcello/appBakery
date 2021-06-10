package com.Bakarery.BakeryProject.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TComanda")
public class Comanda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int codigoComanda;
	private double valor;
	private String data;
	private String hora;
	
//	private Funcionario funcionario;
//	private List<Serviços> servicos;
	
	public Comanda() {
		
	}
	
	public Comanda(int codigoComanda, double valor) {
		this.codigoComanda = codigoComanda;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCodigoComanda() {
		return codigoComanda;
	}

	public void setCodigoComanda(int codigoComanda) {
		this.codigoComanda = codigoComanda;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Comanda [codigoComanda=" + codigoComanda + ", valor=" + valor + ", data=" + data + ", hora=" + hora
				+ "]";
	}
	
	
	
}

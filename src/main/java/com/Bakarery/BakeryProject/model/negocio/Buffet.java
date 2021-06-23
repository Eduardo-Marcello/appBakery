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

	private String tipo;
	private String prato;
	private boolean infantil;
	
	public Buffet() {
		
	}
	
	public Buffet(String tipo, String prato, boolean infantil) {
		this.tipo = tipo;
		this.prato = prato;
		this.infantil = infantil;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPrato() {
		return prato;
	}

	public void setPrato(String prato) {
		this.prato = prato;
	}
	
	public boolean isInfantil() {
		return infantil;
	}

	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}

	@Override
	public String toString() {
		return super.toString()+" " + tipo + " " + prato;
	}

	
	
}

package com.Bakarery.BakeryProject.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TUsuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public float calcularSalarioAnual() {
		return "eduardo marcello".equalsIgnoreCase(this.getNome()) ? 1000 : 500;

	}
	
	@Override
	public String toString() {
		return String.format("%d - %s - %s", 
					this.getId(),
					this.getNome(),
					this.getEmail()
				);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

package com.Bakarery.BakeryProject.model.negocio;

public class Cliente {
	private Integer id;
	
	private String nome;
	private String cpf;
	private String telefone;
	private int idade;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String cpf, String telefone, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return nome + " " + cpf + " " + telefone + " " + idade;
	}
	
	
	
	
}

package com.Bakarery.BakeryProject.AT;

public class Delivery {
	private String enderecoCliente;
	private String telefoneCliente;
	private String horaEntrega;
	
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
	@Override
	public String toString() {
		return  enderecoCliente + " " + telefoneCliente;
	}
	
	
}

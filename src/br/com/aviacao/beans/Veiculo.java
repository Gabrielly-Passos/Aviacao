package br.com.aviacao.beans;

public class Veiculo {
	
	private String modelo;
	private int quantJanelas;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQuantJanelas() {
		return quantJanelas;
	}
	public void setQuantJanelas(int quantJanelas) {
		this.quantJanelas = quantJanelas;
	} 
	
	public String MostrarAtributos() {
		return "Exibir Modelo " + getModelo()
		+ "Exibir Quantidade Jannelas " + getQuantJanelas();
	}
}

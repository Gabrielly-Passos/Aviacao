package br.com.aviacao.beans;

public class Aviao extends Veiculo {
  
	public int getQuantRodas() {
		return quantRodas;
	}

	public void setQuantRodas(int quantRodas) {
		this.quantRodas = quantRodas;
	}

	private int quantRodas; 
	
	@Override
	
	public String MostrarAtributos() {
		return "Exibir Modelo " + getModelo()
		+ "Exibir Quantidade Jannelas " + getQuantJanelas()
		+ "Exibir quantidade de Rodas" + getQuantRodas();
	}
	
	
}

package br.com.aviacao.beans;

public class Helicoptero  extends Veiculo{
 	
	private int quantHelice;

	public int getQuantHelice() {
		return quantHelice;
	}

	public void setQuantHelice(int quantHelice) {
		this.quantHelice = quantHelice;
	} 
	
	@Override
	
	public String MostrarAtributos() {
		return "Exibir Modelo " + getModelo()
		+ "Exibir Quantidade Janelas " + getQuantJanelas()
		+ "Exibir Quantidade de Helices " + getQuantHelice();
	}
}

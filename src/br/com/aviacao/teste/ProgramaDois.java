package br.com.aviacao.teste;

import javax.swing.JOptionPane;

import br.com.aviacao.beans.Veiculo;



public class ProgramaDois {

	public static void main(String[] args) {
		
		int i = 0;
		
		Veiculo [] veiculo = new Veiculo[2];
		
		for(i = 0; i < 2;  i++ ) {
			
		

	    String modelo = JOptionPane.showInputDialog("Digite o modelo do Aviao");	
	    int quantJanelas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Janelas"));
	 
	    veiculo[i]  = new Veiculo();
	    veiculo[i].setModelo(modelo);
	    veiculo[i].setQuantJanelas(quantJanelas);
	    
	    
		}
		
		  for(Veiculo v : veiculo ) {
			  
			  System.out.println("\n Modelo  "+ v.getModelo()+  "\n a largura " + v.getQuantJanelas());
		  }
	    
		
	 
		
		
		

	}

}

package br.com.aviacao.teste;

import br.com.aviacao.beans.Aviao;
import br.com.aviacao.beans.Helicoptero;

public class ProgramaUm {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		
		aviao.setModelo("Aviaozinho");
		aviao.setQuantJanelas(5);
		aviao.setQuantRodas(9);
		
		Helicoptero helicoptero = new Helicoptero();
		
		helicoptero.setModelo("Santos");
		helicoptero.setQuantJanelas(9);
		helicoptero.setQuantHelice(10);
		
		System.out.println("Modelo aviao : " + helicoptero.getModelo() + " Quantidade de janelas Helicoptero " + helicoptero.getQuantJanelas()+ " Quantodade de Helices " + helicoptero.getQuantHelice());
		System.out.println("Modelo aviao : " + aviao.getModelo() + " Quantidade de janelas Helicoptero " + aviao.getQuantJanelas() + " Aviao Quantidade de rodas " + aviao.getQuantRodas());

	}

}

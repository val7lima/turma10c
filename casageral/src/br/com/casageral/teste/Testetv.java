package br.com.casageral.teste;

import javax.swing.JOptionPane;

import br.com.casageral.modelo.Televisao;

public class Testetv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televisao tv = new Televisao();
		
		tv.preencherMarcar("sony");
		
		
		
		
		if(JOptionPane.showConfirmDialog(null, "Ligar?","Pergunta",JOptionPane.YES_NO_OPTION)==0) {


			System.out.println(tv.retornarMarca());
			System.out.println(tv.ligar());
			
			tv.mudarCanal(Integer.parseInt(JOptionPane.showInputDialog("Digite o canal: ")));
			tv.aumentarVolume(Integer.parseInt(JOptionPane.showInputDialog("Aumente o volume: ")));
			
			System.out.println("Canal " +tv.retornarCanal());
			System.out.println("volume aumentado " +tv.retornarVolume());



		}else {

			System.out.println(tv.desligar());
			
			//chamar o metodo tudo

			System.out.println(tv.retornarTudo());
		}

		
		
	}

}

package br.com.concessionaria.teste;

import javax.swing.JOptionPane;

import br.com.concessionaria.modelo.Formula1;

public class Testeformula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//criar um objeto, nao tem as informa�oes da classe
		Formula1 objeto = null; // criando objeto, nao consegue buscar as caracteristicas, nao tem espa�o na memoria
		String nome = ""; // � uma Classe, objeto referencia, 
		int numero=0; // tipo primitivo
		//Instancia um objeto, tem as informa�oes da classe

		Formula1 carro = new Formula1(); //instanciando um objeto, ja tem todas as caracteristicas
		// instanciar um objeto NEW Classe()

		Formula1 carro2 = new Formula1(); //instanciando um objeto, ja tem todas as caracteristicas

		Formula1 carro3 = new Formula1(); //instanciando um objeto, ja tem todas as caracteristicas

		carro.preencherEscuderia("ferraria");
		//carro.preencherEscuderia(JOptionPane.showInputDialog("Escuderia"));
		System.out.println(carro.retornarEscuderia());

		carro.prencherCor("red");
		System.out.println(carro.retornarCor());

		carro.preencherValor((float) 1000000.10);
		System.out.println(carro.retornarValor());

//		do {



			if(JOptionPane.showConfirmDialog(null, "Ligar?","Pergunta",JOptionPane.YES_NO_OPTION)==0) {


				System.out.println(carro.ligar());



			}else {
				System.out.println(carro.desligar());
			}


//		}while(true);
			
			
			carro.acelerar(50);
			carro.acelerar(30);
			System.out.println(carro.retornarVelocidadeAtual());
			carro.desacelerar(120);
			System.out.println(carro.retornarVelocidadeAtual());
			
			



	}

}

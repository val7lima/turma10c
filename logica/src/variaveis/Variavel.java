package variaveis;

import javax.swing.JOptionPane;
//pacote swing sobre tela


public class Variavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Tipos de Dados=>
		 * Alfanum�rico: � o dados que nao dever utilizado em opera��o matematica
		 * CEP=> 00010-009 (dentro do contexto para CEP)
		 * 
		 * Num�rico: � o dado ser usado em opera��o matematica
		 * ele � um dado chave de busca dentro da aplicacao
		 * Definir o dado, precisa de contexto
		 * exemplo correrio vc alterar cep numerico para alfanumerico
		 * vc impacta a pesquisar, pq alfanumero tem varias possibilidade de
		 * pesquisa, e numero 13 possbilidades 0 9, . -
		 *
		 *  
		 *  Dois tipos numericos:
		 *  int => para numeros inteiros
		 *  double =>  para numeros reais (com casas decimais)
		 *  
		 *
		 */
		
		String nome = JOptionPane.showInputDialog("Digite seu Nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade: "));
		//parse � uma converter
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		
		
		double imc = peso / (altura*altura);

		System.out.println("Usu�rio: " +nome);
		System.out.println("Idade: " +idade);
		//%f numeros reias, %s string, %d inteiros
		System.out.printf("IMC: %.2f\n", imc);
		
	}

}

package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	//WHILE SEMPRE PENSAR NA NEGA��O NUMB!=NUMA
	//WHILE INTERESSAO COM USUARIO
	//FOR � LEITURA DO ARQUIVO
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * um jogo de advinhacao
		 * o jogador 1 digita um numero inteiro
		 * o jogador 2 tem que advinhar o numero digitado pelo jogador 1
		 * enquando ele nao acertar o jogo continua perguntando o numero
		 * 
		 * etapa2:
		 * acrescente uma contagem de tentativas jogador2, e apresente quantas tentativas 
		 * usou para acerta o numero
		 * 
		 * Etapa 3 
		 * acrescente dicas, para o jogador 2, indicador se o numero que
		 * ele esta tentando advinhar � maior ou menos do que ele chutou
		 * 
		 */

		//etapa1		

		int tentativaA=0;
		int tentativaB=0;
		int numB=0;
		int numA = Integer.parseInt(JOptionPane.showInputDialog("Digite numero entre 0 a 9:"));

		do {
			numB = Integer.parseInt(JOptionPane.showInputDialog("Advinha numero:"));

			tentativaB=tentativaB+1;
			//contador++;
			//contador+=1;

			if(numB<numA) {
				System.out.println("numero � menor");
				JOptionPane.showMessageDialog(null,"numero menor");
			}else if(numB>numA){
				System.out.println("numero � maior");
				JOptionPane.showMessageDialog(null,"numero maior");

			}

		}while(numA!=numB); //pega negacao para while, if na verdadeiro

		System.out.println("Parabens acertou, tentativa do jogadorB: " + tentativaB);
		JOptionPane.showMessageDialog(null,"Parabens acertou");



	}

}

package repeticao;

import javax.swing.JOptionPane;

public class Exercicios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1�) Crie um programa que pergunte ao usu�rio o seu n�vel 
		 * de escolaridade (M�dio, Superior ou P�s) enquanto a resposta 
		 * for v�lida, ir� computando os totais dos n�veis digitados, no final apresente somente o n�vel que foi mais votado.
		 * 2�) Monte um programa que solicite a idade e o nome das pessoas. 
		 * Ao terminar, o programa dever� exibir a pessoa mais velha, 
		 * a pessoa mais nova, a quantidade de pessoas maiores de idade e a m�dia entre as idades que foram digitadas.
		 */
		String escolaridade ="";
		int contadorA=0;
		int contadorB=0;
		int contadorC=0;


		do {
			escolaridade= JOptionPane.showInputDialog("Digite Medio, Superior ou Pos").toUpperCase();
			if(escolaridade.equals("MEDIO")) {
				contadorA++;
			}else if(escolaridade.equals("SUPERIOR")) {
				contadorB++;
			}else if(escolaridade.equals("POS")) {
				contadorC++;
			}
		}while(escolaridade.equals("MEDIO") || escolaridade.equals("SUPERIOR")|| escolaridade.equals("POS")); //pega negacao para while, if na verdadeiro

		System.out.println("total da escolaridade Medio: " + contadorA);
		System.out.println("total da escolaridade Superior: " + contadorB);
		System.out.println("total da escolaridade Pos: " + contadorC);




	}

}

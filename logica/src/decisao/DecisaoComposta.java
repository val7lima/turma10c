package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite nota2"));
		float media = (nota1+nota2)/2;

		int falta = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde de faltas: "));

		// Exibir a mensagem Infelizmente voce foi reprovado com a media
		//and => &&
		//or  => ||

		if (media>=6 && falta<=20) {
			System.out.println("Aprovado com media: " + media);
		} else if (media<4 || falta>20) {
			System.out.println("Infelizmente foi reprovado: " + media);
		} else 
			// nao precisa do if		
			//else if(media>=4 && media<6)		
		{
			System.out.println("Voce ainda tem uma change no exame");

		}

		System.out.println("Ate logo");

	}

}

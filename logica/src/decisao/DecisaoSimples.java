package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  peçam o total de faltas
		 *  se o total de faltas for maior que 20, o aluno esta reprovado
		 */
		
		
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite nota2"));
		int falta = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde de faltas: "));		
		// Exibir a mensagem Infelizmente voce foi reprovado com a media

		float media = (nota1+nota2)/2;
		
		if (media>=6 && falta<=20) {
			System.out.println("Aprovado com media: " + media);
		}
		
		// Exibir a mensagem Infelizmente voce foi reprovado com a media
	
		if (media<4) {
			System.out.println("Infelizmente foi reprovado: " + media);
		}
		
		//and => &&
		//or  => ||
		
		if(media>=4 && media<6 && falta<=20) {
		
			System.out.println("Voce ainda tem uma change no exame");
			
		}
		
	}

}

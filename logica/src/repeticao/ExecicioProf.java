package repeticao;

import javax.swing.JOptionPane;

public class ExecicioProf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exerciocios 2, idade
		// while quando nao sabe o fim
		//for sabe quando tem fim do arquivo
		//fazer por parte... fazer os mais faceis primeiro
		//criar variavel fora do la�o looppp, boa pratica
		// fazer os mais faceis para dificil
		
		
		String nome="";
		short idade=0;
		//String resposta=""; usar resposta para string
		int resposta=0;
		int contMaiorIdade=0;
		int qtdePessoas=0;
		int totalIdades=0;
		String pessoaMaisExperiente="";
		int idadeMaisExperiente=0;
		String pessoaMaisJovem="";
		int idadeMaisJovem=0;
		
		
		
		do {
			//resposta = JOptionPane.showInputDialog("Digite Sim para continuar").toUpperCase();

			nome = JOptionPane.showInputDialog("digite o nome");
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite idade"));
			
			
			if(idade>=18) {
				contMaiorIdade++;
			}
			
			
			totalIdades+=idade; //totalIdades=totalIdades+idade; // media idade
			qtdePessoas++;
			
			if(idade>idadeMaisExperiente) {
				idadeMaisExperiente=idade;
				pessoaMaisExperiente=nome;
			} 

			if(idade<idadeMaisJovem || qtdePessoas ==1) // quando for primeira vez, colocar OR e contador 1
			{
				idadeMaisJovem=idade;
				pessoaMaisJovem=nome;
			}

			
			resposta = JOptionPane.showConfirmDialog(
					null, // posicao inicial da janela, centralizada monitor
					"Deseja continuar:", // mensagem principal 
					"Pergunta", // mensagem que aparece na barra de titulo da janela
					JOptionPane.YES_NO_OPTION // configuracao dos botoes da janela
					);

			
			
			
			
			//}while(resposta.equals("SIM"));
			//	}while(JOptionPane.showConfirmDialog(
			//			null,
			//			"Deseja continuar:",
			//			"Pergunta",
			//			JOptionPane.YES_NO_OPTION==0); � possivel colocar dentro do while a caixinha

		}while(resposta==0);
		
		System.out.println("Total de pessoas maiores idade:" +contMaiorIdade);
		System.out.println("Media de idades:" +(totalIdades/qtdePessoas));
		System.out.println("Pessoa mais experiente:" +pessoaMaisExperiente + " " + idadeMaisExperiente );
		System.out.println("Pessoa mais Jovem:" +pessoaMaisJovem + " " + idadeMaisJovem );

		
	}

}

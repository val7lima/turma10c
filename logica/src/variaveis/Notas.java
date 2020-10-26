package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// input nome do aluno, disciplina, duas notas
		// Exibir o nome do aluno, media, e a disciplina
		
		String nomealuno = JOptionPane.showInputDialog("Digite nome do aluno: ");
		String materia = JOptionPane.showInputDialog("Digite nome da Disciplina: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota1:"));;
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota2:"));;

		double media = (nota1 + nota2)/2;
		
		System.out.println("Nome do Aluno: " +nomealuno);
		System.out.println("Media das notas: " +media);
		System.out.println("Nome da Disciplina: " +materia);
		JOptionPane.showMessageDialog(null, nomealuno + "\n" + materia + "\n" +media);
		// mostra a saida em uma janela
		/* regras para os identificadores
		* 1 nunca começaras com numero, nao pode 1berto (invalido)
		* 2 nao utilizarás palavras reservadas da linguagem. void (invalido)
		* 3 nao farás uso de caracteres especiais. d@t@ (invalido)
		* 
		* padroes para variaveis
		* começar com letras minuscula
		*  utilizar padrao CamelCase. dataNascimento // numeroDeMatricula //
		* nomes significativos
		* toda classe começa com letra Maiuscula
		* todo metodo vem seguindo parenteses main(*)
		* 
		*   
		*  xpto variavel, Xpto Classe, xpto() metodo
		*/
		
	}

}

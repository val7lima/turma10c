package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.util.Magica;

public class ImplementacaoAluno3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno alunoy = new Aluno(
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("Nome").toUpperCase(),
				JOptionPane.showInputDialog("Email").toLowerCase()
				);
		
		// usando a classe Magica para digitar menos durante a programação
		Aluno alunox = new Aluno(
				Magica.i("RM"),
				Magica.s("Nome"),
				Magica.s("Email")
				);
		
		
		
		System.out.println(alunoy.getAll());
		//usando alunox classe magica
		System.out.println(alunox.getAll());
		
	}

}

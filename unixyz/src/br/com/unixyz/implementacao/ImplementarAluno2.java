package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;

public class ImplementarAluno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno alunox = new Aluno();
		
		
		alunox.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("RM")), 
				JOptionPane.showInputDialog("Nome").toUpperCase(), 
				JOptionPane.showInputDialog("email").toLowerCase()
				);
		
		System.out.println(alunox.getAll());
		
		
		
		
	}

}

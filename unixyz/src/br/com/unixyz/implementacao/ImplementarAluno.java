package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		
		Aluno alunov = new Aluno(); // estou criando objeto aluno e depois = instanciar aluo
		
		
		//alunov.setEmail(JOptionPane.showInputDialog("email: ").toLowerCase());
		//alunov.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
		//alunov.setRm(Integer.parseInt(JOptionPane.showInputDialog("RM")));
		
		//System.out.println("RM.....: " + alunov.getRm());
		//System.out.println("Nome...: " + alunov.getNome());
		//System.out.println("Email..: " + alunov.getEmail());
		
		//System.out.println(alunov); vem posicao da memoria do objeto
		
		
		   
		
		alunov.setAll(32604, "Valdemir", "val@val");
		System.out.println(alunov.getAll());
		
		
		

	}

}

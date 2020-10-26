package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Curso;

public class ImplementacaoCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso cursov = new Curso();
		
//		Curso cursox = new Curso(
//				Integer.parseInt(JOptionPane.showInputDialog("ID")),
//				JOptionPane.showInputDialog("descricao"),
//				Float.parseFloat(JOptionPane.showInputDialog("valor")),
//				Integer.parseInt(JOptionPane.showInputDialog("Carga Horaria:"))
//				);
		
		
		
		
		cursov.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("ID: ")), 
				JOptionPane.showInputDialog("Descrição: "), 
				Float.parseFloat(JOptionPane.showInputDialog("Valor do Curso: ")), 
				Integer.parseInt(JOptionPane.showInputDialog("Carga Horaria: "))
				);
		
		System.out.println("ID: " +cursov.getId());
		System.out.println("Descrição: " +cursov.getDescricao());
		System.out.println("Valor: " + cursov.getValor());
		System.out.println("Carga Horaria: " + cursov.getCargaHoraria());
		
		
		//System.out.println(cursov.getAll());
	}

}

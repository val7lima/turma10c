package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.util.Magica;

public class ImplementacaoProfessor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Professor professor = new Professor(
				Magica.i("ID"),
				Magica.s("Nome "),
				Magica.s("Formacao "),
				new Endereco(
						Magica.s("Rua "),
						Magica.s("Numero"),
						Magica.s("Completo "),
						Magica.s("Bairro "),
						Magica.s("Cidade"),
						Magica.s("Estado"),
						Magica.s("CEP ")
						)
				);
		
		
		System.out.println(professor.getAll());
		

		
		
		
		
		
		
		
		
		
		
	} // fecha o main

}

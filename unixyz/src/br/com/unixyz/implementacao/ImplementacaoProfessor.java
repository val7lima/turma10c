package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.util.Magica;

public class ImplementacaoProfessor {

	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//void nao tem atribuito varialvel, apenas nas calasse classes
		
		
		
		Professor professor1 = new Professor();
		
		Endereco endereco = new Endereco();//objeto endereco
		
//		ImplementacaoProfessor ok  = new ImplementacaoProfessor();
		professor1.setId(Magica.i("ID "));
		professor1.setNome(Magica.s("Nome "));
		professor1.setFormacao(Magica.s("Formacao "));
		
//MUITO IMPORTANTE ESSA LINHA, VC INSTANCIOU O OBJETO ENDERECO		
		professor1.setEndereco(endereco);
		
// NUNCA ESQUECER DE ATRIBUIR O OBJETO
		
		
		endereco.setLogradouro(Magica.s("Rua: "));
		endereco.setNumero(Magica.s("Numero: "));
		endereco.setBairro(Magica.s("Bairro: "));
		endereco.setCidade(Magica.s("Cidade: "));
		
		
		
// pegar erro no JAVA		
// mensagem de erro, ultima linha main linha 24, foi para CLASSE professor na linha 27 tambem
//		Exception in thread "main" java.lang.NullPointerException
//		at br.com.unixyz.modelo.Professor.getAll(Professor.java:27)
//		at br.com.unixyz.implementacao.ImplementacaoProfessor.main(ImplementacaoProfessor.java:24)		
		
		
		System.out.println(professor1.getAll());
		System.out.println("END " +professor1.getEndereco().getCidade());
		
		
		
		
		
	
	}

}

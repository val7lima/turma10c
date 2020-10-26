package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		
		
		lista.add("DBA");
		lista.add("DEV");
		lista.add("INFRA");
		lista.add("CLOUD");
		lista.add("DBA");
		lista.add("DBA");
		lista.add("DBA");

		
		//Set nao aceita duplicado e pega a posicao da RAM
		
		System.out.println(lista);
		//hash � obrigado FOREACH, nao tem contador
		
		
//		 for(String elemento : lista) {
//			 System.out.println("FOR mais simples => " + elemento);
//		 }
		 
		
		
		
		//Set nao aceita elementos repetidos iguais
		
		
		// desempenho voltado para programacao
		//output e input
		//se melhorar o output, piora o input...
		//se melhorar o input, piora output...
		
		
		
		//Hash vai direto na posicao da memoria, indice, nao precisa fazer comparacao
		//Lista tem que fazer comparacao para pesquisar e encontrar o valor desejado
		
		//hash guarda no melhor lugar, input mais demorado, mas output � rapido
		//lista guarda no lugar mais rapido, input � mais rapido, e output � mais demorado
		
		

	}

}
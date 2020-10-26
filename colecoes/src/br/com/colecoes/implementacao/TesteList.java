package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		//String[] vetor
		//Collection Framework = > recursos para facilitar trabalhos com dados multivalorados 
		// hieraquia das collections -List, Queue, Set (Fila e Pilha) Estrutura de Dados
		// List as instancias : ArrayList, Vector, LinkedList, Stack
		// Queue Deque -> ArrayDeque
		// Set - HashSet LinkedHashSet, SortedSet - TreeSet
		
		
try {		
		
		
		int x[] = new int[3];
		 x[0] = 40;
		 x[1] = 50;
		 x[2] = 60;

		
// nao � melhor forma		ArrayList lista = new ArrayList();

		 
		
// nao � melhor forma		Bacharelado formacao = new Bacharelado();
// melhor forma             Formacao formacao = new Bacharelado();		
		 
		 

		 
//generiques = generelizando s� vetor com string
// List<String>	
		 List<String> lista = new ArrayList<String>(); // sempre criar pela hierarqui do pai
		 

		 
		 lista.add("DBA");
		 lista.add("DEV");
		 lista.add("DEVOPS");
		 lista.add("DBA");
		 		 
		 System.out.println(lista);
		 Collections.sort(lista);
		 System.out.println("Ordenada " +lista);
		 System.out.println("Exibir o 2 elemento: " + lista.get(1));
		 lista.remove(1);
		 System.out.println("Depois de excluir: " + lista);
	
		 // for tradicional
	
		 for(int contador=0; contador<lista.size();contador++) {
			 System.out.println("Dentro do for => " +lista.get(contador));
			 
			 
		 }

		 // Com for Foreach
		 
		 for(String elemento : lista) {
			 
			 System.out.println("FOR mais simples => " + elemento);

		 }
		 
		 
		
}catch(Exception e)
{

	System.out.println("OPS erro !!!");
	
}
		 
		 
		 
		 
		 
		 
		

	}

}

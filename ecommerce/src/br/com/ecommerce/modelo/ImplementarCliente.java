package br.com.ecommerce.modelo;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.PessoaFisica;
import br.com.ecommerce.beans.PessoaJuridica;
import br.com.unixyz.util.Magica;

public class ImplementarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaFisica pf = new PessoaFisica();
		// criar objeto pela super classe pai
		// e instancia pela classe filha
		
		
		 Cliente cli = new PessoaFisica();
		// Cliente cli - crie o objeto da super classe
		// new PessoaFisica(); instancia da classe filha
		
		
		 cli = new PessoaJuridica();
		 cli = new PessoaFisica();
		
		 
		 Cliente c = new Cliente();
		 
		 int resposta = Magica.i("Digite 1 PF  ou 2 PJ");
		 
		 if (resposta==1) {
			 
			 System.out.println("Cliente Pessoa Fisica");
			 c = new PessoaFisica(
					 1,
					 "Regina",
					 "1122-2222",
					 new Endereco(),
					 "123.456.799-00",
					 "00.000.000-X"
					 );
			 
			 
			 
		 } else if (resposta==2) {
			 System.out.println("Cliente Pessoa Juridica");
			 c = new PessoaJuridica(
					 2,
					 "Churros LTD",
					 "1004-4311",
					 new Endereco(),
					 "00.000.000/0001-00",
					 "000.000.000.000",
					 "SR Joao"
					 );
			 
			 
		 }
		 
		 System.out.println(c.getAll());
				

		 
		 
		 
	} //fecha main

} // fecha classe

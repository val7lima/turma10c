package br.com.ecommerce.modelo;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.unixyz.util.Magica;

public class ImplementacaoVenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Venda venda = new Venda(
						Magica.i("Notal Fiscal"),
						Magica.f("Total"),
						Magica.f("Desonto"),
						Magica.s("data"),
						new Cliente(
								Magica.i("ID "),
								Magica.s("Nome "),
								Magica.s("Fone "),
								new Endereco(
										Magica.s("Rua "),
										Magica.s("Numero"),
										Magica.s("Completo "),
										Magica.s("Bairro "),
										Magica.s("Cidade"),
										Magica.s("Estado"),
										Magica.s("CEP ")
										)
								),
						new Produto(							
								Magica.i("ID"),
								Magica.s("Des"),
								Magica.f("Valor"),
								Magica.f("Valor compra"),
								Magica.i("Qtd")
						      		)
					);
		
		
		
		
		System.out.println(venda.getAll());
		
		
	}

}

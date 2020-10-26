package br.com.ecommerce.modelo;

import br.com.ecommerce.beans.Produto;
import br.com.unixyz.util.Magica;

public class ImplementacaoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto p = new Produto();
		
		p.setQtde(Magica.i("Qtde de Produto "));
		p.setValorCompra(Magica.f("Valor da Compra "));
		p.setValorVenda(Magica.f("Valor da Venda"));
		
		// getDesconto() ajustarValores() totalCompra()
		
		
		System.out.println("Qtde de Produto " + p.getQtde());
		System.out.println("Valor da Compra  " + p.getValorCompra());
		System.out.println("Valor da Venda  " + p.getValorVenda());
		System.out.println("Total de compra: " +p.totalCompra());
		System.out.println("Total de Venda " + p.totalVenda());
		System.out.println("Venda com 10% " +p.getDesconto());
		System.out.println("Venda com x% " +p.getDesconto(Magica.f("Porcentagem para desconto")));
		p.ajustarValores(Magica.f("Valor a ser adicionado "));
		System.out.println(p.getValorCompra());
		System.out.println(p.getValorVenda());
		
		
		
		
		
	}

}

package variaveis;

import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crie variaveis nome, codigo, valor e qtd
		// exibe nome do producao, total e total 10%
		// parse = > conversão entre tipos string => primitivo
		// Primitivo => sao os tipos que fazem a parte da linguagem
		// int => Integer
		// double => Double
		// boolean => armazena True ou False
		// char => armazena um caracter
		// byte => numeros inteiros -127 // +128
		// short => numeros inteiros
		// int => numeros inteiros
		// long => numeros inteiros
		// fload => numeros reais
		// double => numeros reais
		

		// Classe Wrapper => sao classes que apoaim os tipos primitivos
		// int => Integer
		// double => Double
		// float => Double
		// boolean => Boolean
		
		
		String produto = JOptionPane.showInputDialog("Digite seu Produto: ");
		int codigo = 77;
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite Valor:"));;
		double qtd = Double.parseDouble(JOptionPane.showInputDialog("Digite qtd:"));
		double desconto = 0.1;
		double total = qtd*valor;
		
		double totald = total -(total * 0.1);
		
		System.out.println("Nome do Produto: " +produto);
		System.out.println("Valor Total: " +total);
		System.out.println("Valor c/ desconto: " +totald);
		
		
		
		
		
		
		
	}

}

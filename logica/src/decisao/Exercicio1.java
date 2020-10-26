package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* exercício1
		 *  Um hotel cobra R$ 80,00 a diária e mais uma taxa de serviços. 
		 *	A taxa de serviços é de: 
		 *	R$ 5,50 por diária, se o número de diárias for maior que 15; R$ 6,00 por diária, se o número de diárias for igual a 15; R$ 8,00 por diária, se o número de diárias for menor que 15.
		 *	Monte uma aplicação que apresente a conta do cliente.
		 */
		
		
		/* exercício2
		 * Escreva um código que leia três valores inteiros e diferentes e mostre-os em ordem decrescente.
		 */
		
		
		String nome = JOptionPane.showInputDialog("Digite o nome do cliente").toUpperCase();
//		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Digite qtd de dias ficara: "));		
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Qtd Diarias"));
		double valor = 80;
		double taxa1 = 5.5;
		double taxa2 = 6;
		double taxa3 = 8;
		double total = 0;
		// tipos de conversões, parses, incompativeis, 
		
		if(diarias>15) {
			total = (valor*diarias) * taxa1;
//			System.out.println(nome + " Valor total a pagar: " +total);
			
		}else if(diarias==15) {

			total = (valor*diarias) * taxa2;
//			System.out.println(nome +" Valor total a pagar: " +total);

		} else {
//			if(diarias<15) {

			 total = (valor*diarias) * taxa3;
//			System.out.println(nome +" Valor total a pagar ok: " +total);

		}
		
		System.out.println(nome +" Valor total a pagar ok: " +total);
		
		
	}

}

package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* exerc�cio1
		 *  Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
		 *	A taxa de servi�os � de: 
		 *	R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15; R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
		 *	Monte uma aplica��o que apresente a conta do cliente.
		 */
		
		
		/* exerc�cio2
		 * Escreva um c�digo que leia tr�s valores inteiros e diferentes e mostre-os em ordem decrescente.
		 */
		
		
		String nome = JOptionPane.showInputDialog("Digite o nome do cliente").toUpperCase();
//		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Digite qtd de dias ficara: "));		
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Qtd Diarias"));
		double valor = 80;
		double taxa1 = 5.5;
		double taxa2 = 6;
		double taxa3 = 8;
		double total = 0;
		// tipos de convers�es, parses, incompativeis, 
		
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

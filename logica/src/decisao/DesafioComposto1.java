package decisao;

import javax.swing.JOptionPane;

public class DesafioComposto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pe�a a entrada de veiculo, capacidade passageiros
		// exiba mensagem:
		// veiculo categoria A, se a qtd for igual 2
		// veiculo categoria B, se a qtd for 4 - 7
		// veiculo categoria C, se qtd for maior que 7

		String veiculo = JOptionPane.showInputDialog("Digite o veiculo terrestre").toUpperCase();
		int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Digite capacidade de passageiros: "));		// Exibir a mensagem Infelizmente voce foi reprovado com a media
		//and => &&
		//or  => ||
		// fazer mais simples mais complexa
		// importante o contexto, exemplo maior categoria B, colocar primeiro no IF
		
		
		if (capacidade==2 && veiculo =="MOTO") {
			System.out.println("Veiculo Categoria A - " + veiculo);
		} else if (capacidade>=4 && capacidade<=7 && veiculo == "CARRO" ) {
			System.out.println("Veiculo Categoria B - " + veiculo);
		} else 
			// nao precisa do if		
			//else if(media>=4 && media<6)		
		{
			System.out.println("Veiculo Categoria C - " +veiculo);

		}

		//System.out.println("Ate logo");



	}

}

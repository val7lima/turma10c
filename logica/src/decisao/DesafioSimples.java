package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pe�a para o usuario nome e idade
		// voce deve ixibir
		// obrigado a votar, se a idade for > 17 e < 70
		// voto facultavivo, se idade = 16 ou 17 ou > 70
		// proibido votar, se idade for < 16
		
		
		String nome = JOptionPane.showInputDialog("Digite o nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade: "));
		
		//come�ar por mais simples, na hora de programar
		
		if(idade > 17 && idade<70) {
			System.out.println(nome +" � obrigado por votar ");
			
		}
		if(idade==16 || idade==17 || idade>70) {
			System.out.println(nome +" Voto facultativo ");
			
		}
		
		if(idade<16) {
			System.out.println(nome +"� proibido votar, aguardamos a idade de 17");
			
		}
		
		


	}

}

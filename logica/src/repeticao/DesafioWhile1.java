package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  solicitar dia, mes e ano, em variaveis separadas
		 *  valide se o ano esta entre 1950 e 2002
		 *  valide se o mes esta entre 1 e 12
		 *  valide se o dia esta entre 1 e 30 (alguns meses)
		 *  entre 1 e 31 para outros meses
		 *  no final exibe data completa
		 *  
		 */


		String msg ="";
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite dia: "));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite mes: "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite ano: "));

		while (ano<1950 || ano>2002)
		{
			ano = Integer.parseInt(JOptionPane.showInputDialog("digite ano novamente"));
		}

		while (mes<1 || mes>12)
		{
			mes = Integer.parseInt(JOptionPane.showInputDialog("digite mes novamente"));
		}

		if(mes==2 || mes==4 || mes==6 || mes==9 || mes==11) //meses com ate 30 dias
		{
			while(dia<1 || dia>30)
			{
				dia = Integer.parseInt(JOptionPane.showInputDialog("digite dia novamente"));

				
			}
		}else
		{
			while(dia<1|| dia>31) //meses com 31 dias
			{
				dia = Integer.parseInt(JOptionPane.showInputDialog("digite o dia novamente"));
			
			}
		}

		System.out.println(dia+"/" + mes + "/" + ano);

		

	}

}

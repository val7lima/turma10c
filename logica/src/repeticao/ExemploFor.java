package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FOr: utilizamos, normalment para leitura etc.
		//tabuada
		
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		for(int count=1;count<11;count++) {
			System.out.println(tabuada + " X " + count + " = " + (tabuada*count));
		}
		

	}

}

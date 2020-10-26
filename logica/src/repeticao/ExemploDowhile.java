package repeticao;

import javax.swing.JOptionPane;

public class ExemploDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String candidato="";
		int totalX=0;
		int totalY=0;
		
		do {
			candidato= JOptionPane.showInputDialog("Digite <X> ou <Y>").toUpperCase();
		
		if(candidato.contentEquals("X")) {
			totalX=totalX+1;
		}else if (candidato.equals("Y")) {
			totalY=totalY+1;
		}
		
		}while(candidato.equals("X") || candidato.equals("Y"));
		System.out.println("total do candidato X: " + totalX);
		System.out.println("total do candidato Y: " + totalY);
		
	}

}

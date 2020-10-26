package repeticao;

import javax.swing.JOptionPane;

public class WhileProf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia"));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mes"));
		short ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano"));
		while (ano<1950 || ano>2002) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano novamente"));
		}
		while (mes<1 || mes>12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mes novamente"));
		}
		if (mes==2 || mes==4 || mes==6 || mes==9 || mes==11) { // meses com até 30 dias
			while (dia<1 || dia>30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}else { // meses com até 31 dias
			while (dia<1 || dia>31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}
		System.out.println(dia + "/" + mes + "/" + ano);

	}

}
